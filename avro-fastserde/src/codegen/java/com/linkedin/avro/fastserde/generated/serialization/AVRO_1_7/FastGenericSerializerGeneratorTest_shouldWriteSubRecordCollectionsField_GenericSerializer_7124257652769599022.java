
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField_GenericSerializer_7124257652769599022
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField119(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField119(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        List<IndexedRecord> recordsArray120 = ((List<IndexedRecord> ) data.get(0));
        (encoder).writeArrayStart();
        if ((recordsArray120 == null)||recordsArray120 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsArray120 .size());
            for (int counter121 = 0; (counter121 <((List<IndexedRecord> ) recordsArray120).size()); counter121 ++) {
                (encoder).startItem();
                IndexedRecord subRecord122 = null;
                subRecord122 = ((List<IndexedRecord> ) recordsArray120).get(counter121);
                serializesubRecord123(subRecord122, (encoder));
            }
        }
        (encoder).writeArrayEnd();
        Map<CharSequence, IndexedRecord> recordsMap125 = ((Map<CharSequence, IndexedRecord> ) data.get(1));
        (encoder).writeMapStart();
        if ((recordsMap125 == null)||recordsMap125 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsMap125 .size());
            for (CharSequence key126 : ((Map<CharSequence, IndexedRecord> ) recordsMap125).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key126);
                IndexedRecord subRecord127 = null;
                subRecord127 = ((Map<CharSequence, IndexedRecord> ) recordsMap125).get(key126);
                serializesubRecord123(subRecord127, (encoder));
            }
        }
        (encoder).writeMapEnd();
        List<IndexedRecord> recordsArrayUnion128 = ((List<IndexedRecord> ) data.get(2));
        if (recordsArrayUnion128 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsArrayUnion128 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<IndexedRecord> ) recordsArrayUnion128) == null)||((List<IndexedRecord> ) recordsArrayUnion128).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<IndexedRecord> ) recordsArrayUnion128).size());
                    for (int counter129 = 0; (counter129 <((List<IndexedRecord> )((List<IndexedRecord> ) recordsArrayUnion128)).size()); counter129 ++) {
                        (encoder).startItem();
                        IndexedRecord union130 = null;
                        union130 = ((List<IndexedRecord> )((List<IndexedRecord> ) recordsArrayUnion128)).get(counter129);
                        if (union130 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union130 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union130).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord123(((IndexedRecord) union130), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        Map<CharSequence, IndexedRecord> recordsMapUnion131 = ((Map<CharSequence, IndexedRecord> ) data.get(3));
        if (recordsMapUnion131 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsMapUnion131 instanceof Map) {
                (encoder).writeIndex(1);
                (encoder).writeMapStart();
                if ((((Map<CharSequence, IndexedRecord> ) recordsMapUnion131) == null)||((Map<CharSequence, IndexedRecord> ) recordsMapUnion131).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, IndexedRecord> ) recordsMapUnion131).size());
                    for (CharSequence key132 : ((Map<CharSequence, IndexedRecord> )((Map<CharSequence, IndexedRecord> ) recordsMapUnion131)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key132);
                        IndexedRecord union133 = null;
                        union133 = ((Map<CharSequence, IndexedRecord> )((Map<CharSequence, IndexedRecord> ) recordsMapUnion131)).get(key132);
                        if (union133 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union133 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union133).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord123(((IndexedRecord) union133), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeMapEnd();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord123(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField124 = ((CharSequence) data.get(0));
        if (subField124 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField124 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField124 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField124));
                } else {
                    (encoder).writeString(subField124 .toString());
                }
            }
        }
    }

}
