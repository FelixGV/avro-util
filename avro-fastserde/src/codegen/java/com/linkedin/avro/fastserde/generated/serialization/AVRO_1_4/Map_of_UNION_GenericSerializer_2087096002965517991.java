
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class Map_of_UNION_GenericSerializer_2087096002965517991
    implements FastSerializer<Map<CharSequence, IndexedRecord>>
{


    public void serialize(Map<CharSequence, IndexedRecord> data, Encoder encoder)
        throws IOException
    {
        (encoder).writeMapStart();
        if ((data == null)||data.isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(data.size());
            for (CharSequence key92 : ((Map<CharSequence, IndexedRecord> ) data).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key92);
                IndexedRecord union93 = null;
                union93 = ((Map<CharSequence, IndexedRecord> ) data).get(key92);
                if (union93 == null) {
                    (encoder).writeIndex(0);
                    (encoder).writeNull();
                } else {
                    if ((union93 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.record".equals(((IndexedRecord) union93).getSchema().getFullName())) {
                        (encoder).writeIndex(1);
                        serializerecord94(((IndexedRecord) union93), (encoder));
                    }
                }
            }
        }
        (encoder).writeMapEnd();
    }

    @SuppressWarnings("unchecked")
    public void serializerecord94(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence field95 = ((CharSequence) data.get(0));
        if (field95 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (field95 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (field95 instanceof Utf8) {
                    (encoder).writeString(((Utf8) field95));
                } else {
                    (encoder).writeString(field95 .toString());
                }
            }
        }
    }

}
