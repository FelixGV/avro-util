
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWritePrimitives_GenericSerializer_5300080091170871849
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWritePrimitives108(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWritePrimitives108(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeInt(((Integer) data.get(0)));
        Integer testIntUnion109 = ((Integer) data.get(1));
        if (testIntUnion109 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testIntUnion109 instanceof Integer) {
                (encoder).writeIndex(1);
                (encoder).writeInt(((Integer) testIntUnion109));
            }
        }
        if (data.get(2) instanceof Utf8) {
            (encoder).writeString(((Utf8) data.get(2)));
        } else {
            (encoder).writeString(data.get(2).toString());
        }
        CharSequence testStringUnion110 = ((CharSequence) data.get(3));
        if (testStringUnion110 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testStringUnion110 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (testStringUnion110 instanceof Utf8) {
                    (encoder).writeString(((Utf8) testStringUnion110));
                } else {
                    (encoder).writeString(testStringUnion110 .toString());
                }
            }
        }
        (encoder).writeLong(((Long) data.get(4)));
        Long testLongUnion111 = ((Long) data.get(5));
        if (testLongUnion111 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testLongUnion111 instanceof Long) {
                (encoder).writeIndex(1);
                (encoder).writeLong(((Long) testLongUnion111));
            }
        }
        (encoder).writeDouble(((Double) data.get(6)));
        Double testDoubleUnion112 = ((Double) data.get(7));
        if (testDoubleUnion112 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testDoubleUnion112 instanceof Double) {
                (encoder).writeIndex(1);
                (encoder).writeDouble(((Double) testDoubleUnion112));
            }
        }
        (encoder).writeFloat(((Float) data.get(8)));
        Float testFloatUnion113 = ((Float) data.get(9));
        if (testFloatUnion113 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testFloatUnion113 instanceof Float) {
                (encoder).writeIndex(1);
                (encoder).writeFloat(((Float) testFloatUnion113));
            }
        }
        (encoder).writeBoolean(((Boolean) data.get(10)));
        Boolean testBooleanUnion114 = ((Boolean) data.get(11));
        if (testBooleanUnion114 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testBooleanUnion114 instanceof Boolean) {
                (encoder).writeIndex(1);
                (encoder).writeBoolean(((Boolean) testBooleanUnion114));
            }
        }
        (encoder).writeBytes(((ByteBuffer) data.get(12)));
        ByteBuffer testBytesUnion115 = ((ByteBuffer) data.get(13));
        if (testBytesUnion115 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testBytesUnion115 instanceof ByteBuffer) {
                (encoder).writeIndex(1);
                (encoder).writeBytes(((ByteBuffer) testBytesUnion115));
            }
        }
    }

}
