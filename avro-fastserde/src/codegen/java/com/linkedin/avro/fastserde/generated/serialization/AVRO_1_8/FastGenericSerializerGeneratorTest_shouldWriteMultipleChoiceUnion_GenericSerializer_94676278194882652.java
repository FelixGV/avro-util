
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_8;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion_GenericSerializer_94676278194882652
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion103(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion103(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        Object union104 = ((Object) data.get(0));
        if (union104 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((union104 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union104).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                serializesubRecord105(((IndexedRecord) union104), (encoder));
            } else {
                if (union104 instanceof CharSequence) {
                    (encoder).writeIndex(2);
                    if (union104 instanceof Utf8) {
                        (encoder).writeString(((Utf8) union104));
                    } else {
                        (encoder).writeString(union104 .toString());
                    }
                } else {
                    if (union104 instanceof Integer) {
                        (encoder).writeIndex(3);
                        (encoder).writeInt(((Integer) union104));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord105(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField106 = ((CharSequence) data.get(0));
        if (subField106 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField106 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField106 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField106));
                } else {
                    (encoder).writeString(subField106 .toString());
                }
            }
        }
    }

}
