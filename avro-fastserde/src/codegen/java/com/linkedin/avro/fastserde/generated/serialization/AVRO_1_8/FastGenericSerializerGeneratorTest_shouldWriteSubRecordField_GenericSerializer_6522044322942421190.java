
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_8;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordField_GenericSerializer_6522044322942421190
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordField157(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordField157(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        IndexedRecord record158 = ((IndexedRecord) data.get(0));
        if (record158 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((record158 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) record158).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                serializesubRecord159(((IndexedRecord) record158), (encoder));
            }
        }
        IndexedRecord record1161 = ((IndexedRecord) data.get(1));
        serializesubRecord159(record1161, (encoder));
        CharSequence field162 = ((CharSequence) data.get(2));
        if (field162 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (field162 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (field162 instanceof Utf8) {
                    (encoder).writeString(((Utf8) field162));
                } else {
                    (encoder).writeString(field162 .toString());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord159(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField160 = ((CharSequence) data.get(0));
        if (subField160 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField160 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField160 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField160));
                } else {
                    (encoder).writeString(subField160 .toString());
                }
            }
        }
    }

}
