
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordField_GenericSerializer_1161833140095035747
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordField158(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordField158(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        IndexedRecord record159 = ((IndexedRecord) data.get(0));
        if (record159 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if ((record159 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) record159).getSchema().getFullName())) {
                (encoder).writeIndex(1);
                serializesubRecord160(((IndexedRecord) record159), (encoder));
            }
        }
        IndexedRecord record1162 = ((IndexedRecord) data.get(1));
        serializesubRecord160(record1162, (encoder));
        CharSequence field163 = ((CharSequence) data.get(2));
        if (field163 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (field163 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (field163 instanceof Utf8) {
                    (encoder).writeString(((Utf8) field163));
                } else {
                    (encoder).writeString(field163 .toString());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord160(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField161 = ((CharSequence) data.get(0));
        if (subField161 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField161 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField161 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField161));
                } else {
                    (encoder).writeString(subField161 .toString());
                }
            }
        }
    }

}
