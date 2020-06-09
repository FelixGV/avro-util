
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;

public class FastGenericSerializerGeneratorTest_shouldWriteFixed_GenericSerializer_8889056593487745201
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteFixed81(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteFixed81(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) data.get(0)).bytes());
        org.apache.avro.generic.GenericData.Fixed testFixedUnion82 = ((org.apache.avro.generic.GenericData.Fixed) data.get(1));
        if (testFixedUnion82 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testFixedUnion82 instanceof org.apache.avro.generic.GenericData.Fixed) {
                (encoder).writeIndex(1);
                (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) testFixedUnion82).bytes());
            }
        }
        List<org.apache.avro.generic.GenericData.Fixed> testFixedArray83 = ((List<org.apache.avro.generic.GenericData.Fixed> ) data.get(2));
        (encoder).writeArrayStart();
        if ((testFixedArray83 == null)||testFixedArray83 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testFixedArray83 .size());
            for (int counter84 = 0; (counter84 <((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedArray83).size()); counter84 ++) {
                (encoder).startItem();
                (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) testFixedArray83 .get(counter84)).bytes());
            }
        }
        (encoder).writeArrayEnd();
        List<org.apache.avro.generic.GenericData.Fixed> testFixedUnionArray85 = ((List<org.apache.avro.generic.GenericData.Fixed> ) data.get(3));
        (encoder).writeArrayStart();
        if ((testFixedUnionArray85 == null)||testFixedUnionArray85 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(testFixedUnionArray85 .size());
            for (int counter86 = 0; (counter86 <((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedUnionArray85).size()); counter86 ++) {
                (encoder).startItem();
                org.apache.avro.generic.GenericData.Fixed union87 = null;
                union87 = ((List<org.apache.avro.generic.GenericData.Fixed> ) testFixedUnionArray85).get(counter86);
                if (union87 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if (union87 instanceof org.apache.avro.generic.GenericData.Fixed) {
                        (encoder).writeIndex(1);
                        (encoder).writeFixed(((org.apache.avro.generic.GenericData.Fixed) union87).bytes());
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

}
