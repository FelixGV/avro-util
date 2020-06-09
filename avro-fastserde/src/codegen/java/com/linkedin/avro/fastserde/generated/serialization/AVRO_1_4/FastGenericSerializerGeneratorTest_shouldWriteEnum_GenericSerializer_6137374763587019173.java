
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;

public class FastGenericSerializerGeneratorTest_shouldWriteEnum_GenericSerializer_6137374763587019173
    implements FastSerializer<IndexedRecord>
{

    private final Schema testEnumEnumSchema74 = Schema.parse("{\"type\":\"enum\",\"name\":\"testEnum\",\"namespace\":\"com.adpilot.utils.generated.avro\",\"symbols\":[\"A\",\"B\"]}");

    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteEnum73(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteEnum73(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeEnum(testEnumEnumSchema74 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) data.get(0)).toString()));
        org.apache.avro.generic.GenericData.EnumSymbol testEnumUnion75 = ((org.apache.avro.generic.GenericData.EnumSymbol) data.get(1));
        if (testEnumUnion75 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testEnumUnion75 instanceof org.apache.avro.generic.GenericData.EnumSymbol) {
                (encoder).writeIndex(1);
                (encoder).writeEnum(testEnumEnumSchema74 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumUnion75).toString()));
            }
        }
        List<org.apache.avro.generic.GenericData.EnumSymbol> testEnumArray76 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(2));
        (encoder).writeArrayStart();
        if ((testEnumArray76 == null)||testEnumArray76 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testEnumArray76 .size());
            for (int counter77 = 0; (counter77 <((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumArray76).size()); counter77 ++) {
                (encoder).startItem();
                (encoder).writeEnum(testEnumEnumSchema74 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumArray76 .get(counter77)).toString()));
            }
        }
        (encoder).writeArrayEnd();
        List<org.apache.avro.generic.GenericData.EnumSymbol> testEnumUnionArray78 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(3));
        (encoder).writeArrayStart();
        if ((testEnumUnionArray78 == null)||testEnumUnionArray78 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testEnumUnionArray78 .size());
            for (int counter79 = 0; (counter79 <((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumUnionArray78).size()); counter79 ++) {
                (encoder).startItem();
                org.apache.avro.generic.GenericData.EnumSymbol union80 = null;
                union80 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumUnionArray78).get(counter79);
                if (union80 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if (union80 instanceof org.apache.avro.generic.GenericData.EnumSymbol) {
                        (encoder).writeIndex(1);
                        (encoder).writeEnum(testEnumEnumSchema74 .getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) union80).toString()));
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

}
