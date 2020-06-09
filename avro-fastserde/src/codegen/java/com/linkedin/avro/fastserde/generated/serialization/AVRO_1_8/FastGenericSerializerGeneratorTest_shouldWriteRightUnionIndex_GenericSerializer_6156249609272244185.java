
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_8;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteRightUnionIndex_GenericSerializer_6156249609272244185
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteRightUnionIndex115(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteRightUnionIndex115(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        Object union_field116 = ((Object) data.get(0));
        if (union_field116 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((union_field116 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.record1".equals(((IndexedRecord) union_field116).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                serializerecord1117(((IndexedRecord) union_field116), (encoder));
            } else {
                if ((union_field116 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.record2".equals(((IndexedRecord) union_field116).getSchema().getFullName())) {
                    (encoder).writeIndex(2);
                    serializerecord2118(((IndexedRecord) union_field116), (encoder));
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializerecord1117(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        if (data.get(0) instanceof Utf8) {
            (encoder).writeString(((Utf8) data.get(0)));
        } else {
            (encoder).writeString(data.get(0).toString());
        }
    }

    @SuppressWarnings("unchecked")
    public void serializerecord2118(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        if (data.get(0) instanceof Utf8) {
            (encoder).writeString(((Utf8) data.get(0)));
        } else {
            (encoder).writeString(data.get(0).toString());
        }
    }

}
