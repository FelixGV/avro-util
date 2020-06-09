
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion_GenericSerializer_4388851848367235159
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion104(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteMultipleChoiceUnion104(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        Object union105 = ((Object) data.get(0));
        if (union105 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((union105 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union105).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                serializesubRecord106(((IndexedRecord) union105), (encoder));
            } else {
                if (union105 instanceof CharSequence) {
                    (encoder).writeIndex(2);
                    if (union105 instanceof Utf8) {
                        (encoder).writeString(((Utf8) union105));
                    } else {
                        (encoder).writeString(union105 .toString());
                    }
                } else {
                    if (union105 instanceof Integer) {
                        (encoder).writeIndex(3);
                        (encoder).writeInt(((Integer) union105));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord106(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField107 = ((CharSequence) data.get(0));
        if (subField107 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField107 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField107 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField107));
                } else {
                    (encoder).writeString(subField107 .toString());
                }
            }
        }
    }

}
