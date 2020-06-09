
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.util.List;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Array_of_UNION_GenericSerializer_585074122056792963
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
            for (int counter69 = 0; (counter69 <((List<IndexedRecord> ) data).size()); counter69 ++) {
                (encoder).startItem();
                IndexedRecord union70 = null;
                union70 = ((List<IndexedRecord> ) data).get(counter69);
                if (union70 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if ((union70 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.record".equals(((IndexedRecord) union70).getSchema().getFullName())) {
                        (encoder).writeIndex(1);
                        serializerecord71(((IndexedRecord) union70), (encoder));
                    }
                }
            }
        }
        (encoder).writeArrayEnd();
    }

    @SuppressWarnings("unchecked")
    public void serializerecord71(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence field72 = ((CharSequence) data.get(0));
        if (field72 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (field72 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (field72 instanceof Utf8) {
                    (encoder).writeString(((Utf8) field72));
                } else {
                    (encoder).writeString(field72 .toString());
                }
            }
        }
    }

}
