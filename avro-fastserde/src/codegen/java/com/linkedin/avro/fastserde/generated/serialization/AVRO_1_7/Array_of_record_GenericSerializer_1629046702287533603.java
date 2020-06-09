
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Array_of_record_GenericSerializer_1629046702287533603
    implements FastSerializer<List<IndexedRecord>>
{


    public void serialize(List<IndexedRecord> data, Encoder encoder)
        throws IOException
    {
        (encoder).writeArrayStart();
        if ((data == null)||data.isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(data.size());
            for (int counter65 = 0; (counter65 <((List<IndexedRecord> ) data).size()); counter65 ++) {
                (encoder).startItem();
                IndexedRecord record66 = null;
                record66 = ((List<IndexedRecord> ) data).get(counter65);
                serializerecord67(record66, (encoder));
            }
        }
        (encoder).writeArrayEnd();
    }

    @SuppressWarnings("unchecked")
    public void serializerecord67(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence field68 = ((CharSequence) data.get(0));
        if (field68 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (field68 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (field68 instanceof Utf8) {
                    (encoder).writeString(((Utf8) field68));
                } else {
                    (encoder).writeString(field68 .toString());
                }
            }
        }
    }

}
