
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWritePrimitives_GenericSerializer_6474991426940668474
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWritePrimitives107(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWritePrimitives107(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        (encoder).writeInt(((Integer) data.get(0)));
        Integer testIntUnion108 = ((Integer) data.get(1));
        if (testIntUnion108 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testIntUnion108 instanceof Integer) {
                (encoder).writeIndex(1);
                (encoder).writeInt(((Integer) testIntUnion108));
            }
        }
        if (data.get(2) instanceof Utf8) {
            (encoder).writeString(((Utf8) data.get(2)));
        } else {
            (encoder).writeString(data.get(2).toString());
        }
        CharSequence testStringUnion109 = ((CharSequence) data.get(3));
        if (testStringUnion109 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testStringUnion109 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (testStringUnion109 instanceof Utf8) {
                    (encoder).writeString(((Utf8) testStringUnion109));
                } else {
                    (encoder).writeString(testStringUnion109 .toString());
                }
            }
        }
        (encoder).writeLong(((Long) data.get(4)));
        Long testLongUnion110 = ((Long) data.get(5));
        if (testLongUnion110 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testLongUnion110 instanceof Long) {
                (encoder).writeIndex(1);
                (encoder).writeLong(((Long) testLongUnion110));
            }
        }
        (encoder).writeDouble(((Double) data.get(6)));
        Double testDoubleUnion111 = ((Double) data.get(7));
        if (testDoubleUnion111 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testDoubleUnion111 instanceof Double) {
                (encoder).writeIndex(1);
                (encoder).writeDouble(((Double) testDoubleUnion111));
            }
        }
        (encoder).writeFloat(((Float) data.get(8)));
        Float testFloatUnion112 = ((Float) data.get(9));
        if (testFloatUnion112 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testFloatUnion112 instanceof Float) {
                (encoder).writeIndex(1);
                (encoder).writeFloat(((Float) testFloatUnion112));
            }
        }
        (encoder).writeBoolean(((Boolean) data.get(10)));
        Boolean testBooleanUnion113 = ((Boolean) data.get(11));
        if (testBooleanUnion113 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testBooleanUnion113 instanceof Boolean) {
                (encoder).writeIndex(1);
                (encoder).writeBoolean(((Boolean) testBooleanUnion113));
            }
        }
        (encoder).writeBytes(((ByteBuffer) data.get(12)));
        ByteBuffer testBytesUnion114 = ((ByteBuffer) data.get(13));
        if (testBytesUnion114 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (testBytesUnion114 instanceof ByteBuffer) {
                (encoder).writeIndex(1);
                (encoder).writeBytes(((ByteBuffer) testBytesUnion114));
            }
        }
    }

}
