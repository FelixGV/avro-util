
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;

public class FastGenericSerializerGeneratorTest_shouldWriteEnum_GenericSerializer_2284596792420879769
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteEnum73(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteEnum73(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeEnum(((org.apache.avro.generic.GenericData.EnumSymbol) data.get(0)).getSchema().getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) data.get(0)).toString()));
        org.apache.avro.generic.GenericData.EnumSymbol testEnumUnion74 = ((org.apache.avro.generic.GenericData.EnumSymbol) data.get(1));
        if (testEnumUnion74 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((testEnumUnion74 instanceof org.apache.avro.generic.GenericData.EnumSymbol)&&"com.adpilot.utils.generated.avro.testEnum".equals(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumUnion74).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                (encoder).writeEnum(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumUnion74).getSchema().getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumUnion74).toString()));
            }
        }
        List<org.apache.avro.generic.GenericData.EnumSymbol> testEnumArray75 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(2));
        (encoder).writeArrayStart();
        if ((testEnumArray75 == null)||testEnumArray75 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testEnumArray75 .size());
            for (int counter76 = 0; (counter76 <((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumArray75).size()); counter76 ++) {
                (encoder).startItem();
                (encoder).writeEnum(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumArray75 .get(counter76)).getSchema().getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) testEnumArray75 .get(counter76)).toString()));
            }
        }
        (encoder).writeArrayEnd();
        List<org.apache.avro.generic.GenericData.EnumSymbol> testEnumUnionArray77 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) data.get(3));
        (encoder).writeArrayStart();
        if ((testEnumUnionArray77 == null)||testEnumUnionArray77 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testEnumUnionArray77 .size());
            for (int counter78 = 0; (counter78 <((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumUnionArray77).size()); counter78 ++) {
                (encoder).startItem();
                org.apache.avro.generic.GenericData.EnumSymbol union79 = null;
                union79 = ((List<org.apache.avro.generic.GenericData.EnumSymbol> ) testEnumUnionArray77).get(counter78);
                if (union79 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if ((union79 instanceof org.apache.avro.generic.GenericData.EnumSymbol)&&"com.adpilot.utils.generated.avro.testEnum".equals(((org.apache.avro.generic.GenericData.EnumSymbol) union79).getSchema().getFullName())) {
                        (encoder).writeIndex(1);
                        (encoder).writeEnum(((org.apache.avro.generic.GenericData.EnumSymbol) union79).getSchema().getEnumOrdinal(((org.apache.avro.generic.GenericData.EnumSymbol) union79).toString()));
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

}
