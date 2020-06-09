package com.linkedin.avro.fastserde;

import com.linkedin.avro.api.PrimitiveBooleanList;
import com.linkedin.avro.api.PrimitiveDoubleList;
import com.linkedin.avro.api.PrimitiveFloatList;
import com.linkedin.avro.api.PrimitiveIntList;
import com.linkedin.avro.api.PrimitiveLongList;
import com.linkedin.avro.fastserde.coldstart.ColdPrimitiveBooleanList;
import com.linkedin.avro.fastserde.coldstart.ColdPrimitiveDoubleList;
import com.linkedin.avro.fastserde.coldstart.ColdPrimitiveFloatList;
import com.linkedin.avro.fastserde.coldstart.ColdPrimitiveIntList;
import com.linkedin.avro.fastserde.coldstart.ColdPrimitiveLongList;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JVar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.util.Utf8;

import static org.apache.avro.Schema.Type.*;


public class SchemaAssistant {
  // The following constants are not available in avro-1.4
  public static final String CLASS_PROP = "java-class";
  public static final String KEY_CLASS_PROP = "java-key-class";

  private final JCodeModel codeModel;
  private final boolean useGenericTypes;
  private Set<Class<? extends Exception>> exceptionsFromStringable;
  /**
   * This is used to collect all the fully qualified classes being used by the
   * generated class.
   * The purpose of this bookkeeping is that in some framework, those classes
   * couldn't be found during compilation time, so we need to manually find
   * the libraries, which define those classes, and put them in the compile classpath.
   */
  private final Set<String> fullyQualifiedClassNameSet = new HashSet<>();

  public SchemaAssistant(JCodeModel codeModel, boolean useGenericTypes) {
    this.codeModel = codeModel;
    this.useGenericTypes = useGenericTypes;
    this.exceptionsFromStringable = new HashSet<>();
  }

  protected JCodeModel getCodeModel() {
    return codeModel;
  }

  protected Set<String> getUsedFullyQualifiedClassNameSet() {
    return fullyQualifiedClassNameSet;
  }

  /* Complex type here means type that it have to handle other types inside itself. */
  public static boolean isComplexType(Schema schema) {
    switch (schema.getType()) {
      case MAP:
      case RECORD:
      case ARRAY:
      case UNION:
        return true;
      default:
        return false;
    }
  }

  public static boolean isPrimitive(Schema schema) {
    switch (schema.getType()) {
      case BOOLEAN:
      case DOUBLE:
      case FLOAT:
      case INT:
      case LONG:
        return true;
      default:
        return false;
    }
  }

  /**
   * Determines if a data type is capable of reuse
   *
   * @param schema of the data type in question
   * @return true if that data type is reusable (by mutating it), false otherwise
   */
  public static boolean isCapableOfReuse(Schema schema) {
    // TODO: Add special handling for Strings... {@link org.apache.avro.util.Utf8} is reusable, but {@link String} is not.
    switch (schema.getType()) {
      case BOOLEAN:
      case DOUBLE:
      case ENUM:
      case FLOAT:
      case INT:
      case LONG:
        return false;
      default:
        return true;
    }
  }

  public static String getSchemaFullName(Schema schema) {
    Schema.Type type = schema.getType();
    boolean isNamedType = type.equals(Schema.Type.ENUM) || type.equals(Schema.Type.FIXED) || type.equals(Schema.Type.RECORD);
    /**
     * Avro-1.4 doesn't support {@link Schema#getFullName()} if the Schema is not a NamedSchema.
     */
    return isNamedType ? schema.getFullName() : type.name();
  }

  public static boolean isNamedType(Schema schema) {
    switch (schema.getType()) {
      case RECORD:
        return true;
      case ENUM:
      case FIXED:
        /**
         * This is used to avoid `getSchema` call since in Avro-1.4, `getSchema` method is not available for Enum and Fixed.
         */
        return Utils.isAvro14() ? false : true;
      default:
        return false;
    }
  }

  public static boolean isStringable(Schema schema) {
    if (!Schema.Type.STRING.equals(schema.getType())) {
      throw new SchemaAssistantException("String schema expected!");
    }

    if (Utils.isAvro14()) {
      return false;
    } else {
      return schema.getProp(CLASS_PROP) != null;
    }
  }

  public static boolean hasStringableKey(Schema schema) {
    if (!Schema.Type.MAP.equals(schema.getType())) {
      throw new SchemaAssistantException("Map schema expected!");
    }

    if (Utils.isAvro14()) {
      return false;
    } else {
      return schema.getProp(KEY_CLASS_PROP) != null;
    }
  }

  public static String getTypeName (Schema schema) {
    Schema.Type schemaType = schema.getType();
    if (Schema.Type.RECORD.equals(schemaType)) {
      return schema.getName();
    } else if (Schema.Type.ARRAY.equals(schemaType)) {
      return "Array_of_" + getTypeName(schema.getElementType());
    } else if (Schema.Type.MAP.equals(schemaType)) {
      return "Map_of_" + getTypeName(schema.getValueType());
    } else {
      return schema.getType().name();
    }
  }

  public void resetExceptionsFromStringable() {
    exceptionsFromStringable = new HashSet<>();
  }

  public Set<Class<? extends Exception>> getExceptionsFromStringable() {
    return exceptionsFromStringable;
  }

  public void setExceptionsFromStringable(Set<Class<? extends Exception>> exceptionsFromStringable) {
    this.exceptionsFromStringable = exceptionsFromStringable;
  }

  private void extendExceptionsFromStringable(String className) {
    if (URL.class.getName().equals(className)) {
      exceptionsFromStringable.add(MalformedURLException.class);
    } else if (URI.class.getName().equals(className)) {
      exceptionsFromStringable.add(URISyntaxException.class);
    } else if (BigInteger.class.getName().equals(className) || BigDecimal.class.getName().equals(className)) {
      exceptionsFromStringable.add(NumberFormatException.class);
    }
  }

  public JClass keyClassFromMapSchema(Schema schema) {
    if (!Schema.Type.MAP.equals(schema.getType())) {
      throw new SchemaAssistantException("Map schema was expected, instead got:" + schema.getType()); //.getName());
    }
    if (hasStringableKey(schema) && !useGenericTypes) {
      extendExceptionsFromStringable(schema.getProp(KEY_CLASS_PROP));
      return codeModel.ref(schema.getProp(KEY_CLASS_PROP));
    } else {
      return defaultStringType();
    }
  }

  private JClass valueClassFromMapSchema(Schema schema) {
    if (!Schema.Type.MAP.equals(schema.getType())) {
      throw new SchemaAssistantException("Map schema was expected, instead got:" + schema.getType()); //.getName());
    }

    return classFromSchema(schema.getValueType());
  }

  private JClass elementClassFromArraySchema(Schema schema) {
    if (!Schema.Type.ARRAY.equals(schema.getType())) {
      throw new SchemaAssistantException("Array schema was expected, instead got:" + schema.getType()); //.getName());
    }

    return classFromSchema(schema.getElementType());
  }

  private JClass classFromUnionSchema(final Schema schema) {
    if (!Schema.Type.UNION.equals(schema.getType())) {
      throw new SchemaAssistantException("Union schema was expected, instead got:" + schema.getType()); //.getName());
    }

    if (schema.getTypes().size() == 1) {
      return classFromSchema(schema.getTypes().get(0));
    }

    if (schema.getTypes().size() == 2) {
      if (Schema.Type.NULL.equals(schema.getTypes().get(0).getType())) {
        return classFromSchema(schema.getTypes().get(1));
      } else if (Schema.Type.NULL.equals(schema.getTypes().get(1).getType())) {
        return classFromSchema(schema.getTypes().get(0));
      }
    }

    return codeModel.ref(Object.class);
  }

  public JClass classFromSchema(Schema schema) {
    return classFromSchema(schema, true, false);
  }

  public JClass classFromSchema(Schema schema, boolean abstractType) {
    return classFromSchema(schema, abstractType, false);
  }

  /* Note that settings abstractType and rawType are not passed to subcalls */
  public JClass classFromSchema(Schema schema, boolean abstractType, boolean rawType) {
    JClass outputClass;

    switch (schema.getType()) {

      case RECORD:
        if (useGenericTypes) {
          if (abstractType) {
            outputClass = codeModel.ref(IndexedRecord.class);
          } else {
            outputClass = codeModel.ref(GenericData.Record.class);
          }
        } else {
          outputClass = codeModel.ref(schema.getFullName());
        }
        break;

      case ARRAY:
        Class klass;
        switch (schema.getElementType().getType()) {
          case BOOLEAN: klass = abstractType ? PrimitiveBooleanList.class : ColdPrimitiveBooleanList.class; break;
          case DOUBLE: klass = abstractType ? PrimitiveDoubleList.class : ColdPrimitiveDoubleList.class; break;
          /**
           * N.B.: FLOAT will get superseded in
           * {@link FastDeserializerGenerator#processArray(JVar, String, Schema, Schema, JBlock, FastDeserializerGeneratorBase.FieldAction, BiConsumer, Supplier)}
           */
          case FLOAT: klass = abstractType ? PrimitiveFloatList.class : ColdPrimitiveFloatList.class; break;
          case INT: klass = abstractType ? PrimitiveIntList.class : ColdPrimitiveIntList.class; break;
          case LONG: klass = abstractType ? PrimitiveLongList.class : ColdPrimitiveLongList.class; break;
          default: {
            if (abstractType) {
              klass = List.class;
            } else if (useGenericTypes) {
              klass = GenericData.Array.class;
            } else {
              klass = ArrayList.class;
            }
          }
        }
        outputClass = codeModel.ref(klass);

        if (!rawType && !isPrimitive(schema.getElementType())) {
          outputClass = outputClass.narrow(elementClassFromArraySchema(schema));
        }
        break;
      case MAP:
        if (!abstractType) {
          outputClass = codeModel.ref(HashMap.class);
        } else {
          outputClass = codeModel.ref(Map.class);
        }
        if (!rawType) {
          outputClass = outputClass.narrow(keyClassFromMapSchema(schema), valueClassFromMapSchema(schema));
        }
        break;
      case UNION:
        outputClass = classFromUnionSchema(schema);
        break;
      case ENUM:
        outputClass =
            useGenericTypes ? codeModel.ref(GenericData.EnumSymbol.class) : codeModel.ref(schema.getFullName());
        break;
      case FIXED:
        outputClass = useGenericTypes ? codeModel.ref(GenericData.Fixed.class) : codeModel.ref(schema.getFullName());
        break;
      case BOOLEAN:
        outputClass = codeModel.ref(Boolean.class);
        break;
      case DOUBLE:
        outputClass = codeModel.ref(Double.class);
        break;
      case FLOAT:
        outputClass = codeModel.ref(Float.class);
        break;
      case INT:
        outputClass = codeModel.ref(Integer.class);
        break;
      case LONG:
        outputClass = codeModel.ref(Long.class);
        break;
      case STRING:
        if (!Utils.isAvro14() && isStringable(schema) && !useGenericTypes) {
          outputClass = codeModel.ref(schema.getProp(CLASS_PROP));
          extendExceptionsFromStringable(schema.getProp(CLASS_PROP));
        } else {
          outputClass = defaultStringType();
        }
        break;
      case BYTES:
        outputClass = codeModel.ref(ByteBuffer.class);
        break;
      default:
        throw new SchemaAssistantException("Incorrect request for " + schema.getType()); //.getName() + " class!");
    }

    /**
     * Exclude the narrowed type.
     * Essentially, for type: java.util.ArrayList<java.util.Map<org.apache.avro.util.Utf8>,
     * {@link JClass#erasure()} will return java.util.ArrayList, and that is the class, which can be located by
     * {@link Class#forName(String)}.
     */
    fullyQualifiedClassNameSet.add(outputClass.erasure().fullName());

    return outputClass;
  }

  protected JClass defaultStringType() {
    return codeModel.ref(Utf8.class);
  }

  public JExpression getEnumValueByName(Schema enumSchema, JExpression nameExpr, JExpression getSchemaExpr) {
    if (useGenericTypes) {
      if (Utils.isAvro14()) {
        return JExpr._new(codeModel.ref(GenericData.EnumSymbol.class)).arg(nameExpr);
      } else {
        return JExpr._new(codeModel.ref(GenericData.EnumSymbol.class)).arg(getSchemaExpr).arg(nameExpr);
      }
    } else {
      return codeModel.ref(enumSchema.getFullName()).staticInvoke("valueOf").arg(nameExpr);
    }
  }

  public JExpression getEnumValueByIndex(Schema enumSchema, JExpression indexExpr, JExpression getSchemaExpr) {
    if (useGenericTypes) {
      /**
       * TODO: Consider ways to avoid instantiating a new {@link org.apache.avro.generic.GenericData.EnumSymbol}
       *       instance, e.g. can we pre-allocate one "canonical" enum instance for each ordinal and keep handing
       *       out the same one repeatedly, given that they are not mutable? */
      if (Utils.isAvro14()) {
        return JExpr._new(codeModel.ref(GenericData.EnumSymbol.class))
            .arg(getSchemaExpr.invoke("getEnumSymbols").invoke("get").arg(indexExpr));
      } else {
        return JExpr._new(codeModel.ref(GenericData.EnumSymbol.class))
            .arg(getSchemaExpr)
            .arg(getSchemaExpr.invoke("getEnumSymbols").invoke("get").arg(indexExpr));
      }
    } else {
      return codeModel.ref(enumSchema.getFullName()).staticInvoke("values").component(indexExpr);
    }
  }

  public JExpression getFixedValue(Schema schema, JExpression fixedBytesExpr, JInvocation getSchemaExpr) {
    if (!useGenericTypes) {
      return JExpr._new(codeModel.ref(schema.getFullName())).arg(fixedBytesExpr);
    } else {
      return JExpr._new(codeModel.ref(GenericData.Fixed.class)).arg(getSchemaExpr).arg(fixedBytesExpr);
    }
  }

  public JExpression getStringableValue(Schema schema, JExpression stringExpr) {
    if (isStringable(schema)) {
      return JExpr._new(classFromSchema(schema)).arg(stringExpr);
    } else {
      return JExpr._new(defaultStringType()).arg(stringExpr);
    }
  }
}
