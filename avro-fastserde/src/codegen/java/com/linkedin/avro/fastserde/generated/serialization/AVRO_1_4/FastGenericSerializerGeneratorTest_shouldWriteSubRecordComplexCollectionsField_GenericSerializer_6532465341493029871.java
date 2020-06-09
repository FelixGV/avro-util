
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField_GenericSerializer_6532465341493029871
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField135(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField135(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        List<Map<CharSequence, IndexedRecord>> recordsArrayMap136 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(0));
        (encoder).writeArrayStart();
        if ((recordsArrayMap136 == null)||recordsArrayMap136 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsArrayMap136 .size());
            for (int counter137 = 0; (counter137 <((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMap136).size()); counter137 ++) {
                (encoder).startItem();
                Map<CharSequence, IndexedRecord> map138 = null;
                map138 = ((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMap136).get(counter137);
                (encoder).writeMapStart();
                if ((map138 == null)||map138 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(map138 .size());
                    for (CharSequence key139 : ((Map<CharSequence, IndexedRecord> ) map138).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key139);
                        IndexedRecord union140 = null;
                        union140 = ((Map<CharSequence, IndexedRecord> ) map138).get(key139);
                        if (union140 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union140 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union140).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord141(((IndexedRecord) union140), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeMapEnd();
            }
        }
        (encoder).writeArrayEnd();
        Map<CharSequence, List<IndexedRecord>> recordsMapArray143 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(1));
        (encoder).writeMapStart();
        if ((recordsMapArray143 == null)||recordsMapArray143 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsMapArray143 .size());
            for (CharSequence key144 : ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray143).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key144);
                List<IndexedRecord> array145 = null;
                array145 = ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray143).get(key144);
                (encoder).writeArrayStart();
                if ((array145 == null)||array145 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(array145 .size());
                    for (int counter146 = 0; (counter146 <((List<IndexedRecord> ) array145).size()); counter146 ++) {
                        (encoder).startItem();
                        IndexedRecord union147 = null;
                        union147 = ((List<IndexedRecord> ) array145).get(counter146);
                        if (union147 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union147 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union147).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord141(((IndexedRecord) union147), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        (encoder).writeMapEnd();
        List<Map<CharSequence, IndexedRecord>> recordsArrayMapUnion148 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(2));
        if (recordsArrayMapUnion148 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsArrayMapUnion148 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion148) == null)||((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion148).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion148).size());
                    for (int counter149 = 0; (counter149 <((List<Map<CharSequence, IndexedRecord>> )((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion148)).size()); counter149 ++) {
                        (encoder).startItem();
                        Map<CharSequence, IndexedRecord> map150 = null;
                        map150 = ((List<Map<CharSequence, IndexedRecord>> )((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion148)).get(counter149);
                        (encoder).writeMapStart();
                        if ((map150 == null)||map150 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(map150 .size());
                            for (CharSequence key151 : ((Map<CharSequence, IndexedRecord> ) map150).keySet()) {
                                (encoder).startItem();
                                (encoder).writeString(key151);
                                IndexedRecord union152 = null;
                                union152 = ((Map<CharSequence, IndexedRecord> ) map150).get(key151);
                                if (union152 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union152 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union152).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializesubRecord141(((IndexedRecord) union152), (encoder));
                                    }
                                }
                            }
                        }
                        (encoder).writeMapEnd();
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        Map<CharSequence, List<IndexedRecord>> recordsMapArrayUnion153 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(3));
        if (recordsMapArrayUnion153 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsMapArrayUnion153 instanceof Map) {
                (encoder).writeIndex(1);
                (encoder).writeMapStart();
                if ((((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion153) == null)||((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion153).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion153).size());
                    for (CharSequence key154 : ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion153)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key154);
                        List<IndexedRecord> array155 = null;
                        array155 = ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion153)).get(key154);
                        (encoder).writeArrayStart();
                        if ((array155 == null)||array155 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(array155 .size());
                            for (int counter156 = 0; (counter156 <((List<IndexedRecord> ) array155).size()); counter156 ++) {
                                (encoder).startItem();
                                IndexedRecord union157 = null;
                                union157 = ((List<IndexedRecord> ) array155).get(counter156);
                                if (union157 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union157 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union157).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializesubRecord141(((IndexedRecord) union157), (encoder));
                                    }
                                }
                            }
                        }
                        (encoder).writeArrayEnd();
                    }
                }
                (encoder).writeMapEnd();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord141(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField142 = ((CharSequence) data.get(0));
        if (subField142 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField142 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField142 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField142));
                } else {
                    (encoder).writeString(subField142 .toString());
                }
            }
        }
    }

}
