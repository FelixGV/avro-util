
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_8;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;

public class FastGenericSerializerGeneratorTest_shouldWriteFixed_GenericSerializer_3335671775395101159
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteFixed80(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteFixed80(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) data.get(0)).bytes());
        org.apache.avro.generic.GenericData.Fixed testFixedUnion81 = ((org.apache.avro.generic.GenericData.Fixed) data.get(1));
        if (testFixedUnion81 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((testFixedUnion81 instanceof org.apache.avro.generic.GenericData.Fixed)&&"com.adpilot.utils.generated.avro.testFixed".equals(((org.apache.avro.generic.GenericData.Fixed) testFixedUnion81).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) testFixedUnion81).bytes());
            }
        }
        List<org.apache.avro.generic.GenericData.Fixed> testFixedArray82 = ((List<org.apache.avro.generic.GenericData.Fixed> ) data.get(2));
        (encoder).writeArrayStart();
        if ((testFixedArray82 == null)||testFixedArray82 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testFixedArray82 .size());
            for (int counter83 = 0; (counter83 <((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedArray82).size()); counter83 ++) {
                (encoder).startItem();
                (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) testFixedArray82 .get(counter83)).bytes());
            }
        }
        (encoder).writeArrayEnd();
        List<org.apache.avro.generic.GenericData.Fixed> testFixedUnionArray84 = ((List<org.apache.avro.generic.GenericData.Fixed> ) data.get(3));
        (encoder).writeArrayStart();
        if ((testFixedUnionArray84 == null)||testFixedUnionArray84 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testFixedUnionArray84 .size());
            for (int counter85 = 0; (counter85 <((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedUnionArray84).size()); counter85 ++) {
                (encoder).startItem();
                org.apache.avro.generic.GenericData.Fixed union86 = null;
                union86 = ((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedUnionArray84).get(counter85);
                if (union86 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if ((union86 instanceof org.apache.avro.generic.GenericData.Fixed)&&"com.adpilot.utils.generated.avro.testFixed".equals(((org.apache.avro.generic.GenericData.Fixed) union86).getSchema().getFullName())) {
                        (encoder).writeIndex(1);
                        (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) union86).bytes());
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

}
