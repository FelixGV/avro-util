
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_7;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField_GenericSerializer_7914368223999287780
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField134(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordComplexCollectionsField134(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        List<Map<CharSequence, IndexedRecord>> recordsArrayMap135 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(0));
        (encoder).writeArrayStart();
        if ((recordsArrayMap135 == null)||recordsArrayMap135 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsArrayMap135 .size());
            for (int counter136 = 0; (counter136 <((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMap135).size()); counter136 ++) {
                (encoder).startItem();
                Map<CharSequence, IndexedRecord> map137 = null;
                map137 = ((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMap135).get(counter136);
                (encoder).writeMapStart();
                if ((map137 == null)||map137 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(map137 .size());
                    for (CharSequence key138 : ((Map<CharSequence, IndexedRecord> ) map137).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key138);
                        IndexedRecord union139 = null;
                        union139 = ((Map<CharSequence, IndexedRecord> ) map137).get(key138);
                        if (union139 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union139 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union139).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord140(((IndexedRecord) union139), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeMapEnd();
            }
        }
        (encoder).writeArrayEnd();
        Map<CharSequence, List<IndexedRecord>> recordsMapArray142 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(1));
        (encoder).writeMapStart();
        if ((recordsMapArray142 == null)||recordsMapArray142 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsMapArray142 .size());
            for (CharSequence key143 : ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray142).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key143);
                List<IndexedRecord> array144 = null;
                array144 = ((Map<CharSequence, List<IndexedRecord>> ) recordsMapArray142).get(key143);
                (encoder).writeArrayStart();
                if ((array144 == null)||array144 .isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(array144 .size());
                    for (int counter145 = 0; (counter145 <((List<IndexedRecord> ) array144).size()); counter145 ++) {
                        (encoder).startItem();
                        IndexedRecord union146 = null;
                        union146 = ((List<IndexedRecord> ) array144).get(counter145);
                        if (union146 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union146 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union146).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord140(((IndexedRecord) union146), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        (encoder).writeMapEnd();
        List<Map<CharSequence, IndexedRecord>> recordsArrayMapUnion147 = ((List<Map<CharSequence, IndexedRecord>> ) data.get(2));
        if (recordsArrayMapUnion147 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsArrayMapUnion147 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion147) == null)||((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion147).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion147).size());
                    for (int counter148 = 0; (counter148 <((List<Map<CharSequence, IndexedRecord>> )((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion147)).size()); counter148 ++) {
                        (encoder).startItem();
                        Map<CharSequence, IndexedRecord> map149 = null;
                        map149 = ((List<Map<CharSequence, IndexedRecord>> )((List<Map<CharSequence, IndexedRecord>> ) recordsArrayMapUnion147)).get(counter148);
                        (encoder).writeMapStart();
                        if ((map149 == null)||map149 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(map149 .size());
                            for (CharSequence key150 : ((Map<CharSequence, IndexedRecord> ) map149).keySet()) {
                                (encoder).startItem();
                                (encoder).writeString(key150);
                                IndexedRecord union151 = null;
                                union151 = ((Map<CharSequence, IndexedRecord> ) map149).get(key150);
                                if (union151 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union151 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union151).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializesubRecord140(((IndexedRecord) union151), (encoder));
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
        Map<CharSequence, List<IndexedRecord>> recordsMapArrayUnion152 = ((Map<CharSequence, List<IndexedRecord>> ) data.get(3));
        if (recordsMapArrayUnion152 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsMapArrayUnion152 instanceof Map) {
                (encoder).writeIndex(1);
                (encoder).writeMapStart();
                if ((((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion152) == null)||((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion152).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion152).size());
                    for (CharSequence key153 : ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion152)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key153);
                        List<IndexedRecord> array154 = null;
                        array154 = ((Map<CharSequence, List<IndexedRecord>> )((Map<CharSequence, List<IndexedRecord>> ) recordsMapArrayUnion152)).get(key153);
                        (encoder).writeArrayStart();
                        if ((array154 == null)||array154 .isEmpty()) {
                            (encoder).setItemCount(0);
                        } else {
                            (encoder).setItemCount(array154 .size());
                            for (int counter155 = 0; (counter155 <((List<IndexedRecord> ) array154).size()); counter155 ++) {
                                (encoder).startItem();
                                IndexedRecord union156 = null;
                                union156 = ((List<IndexedRecord> ) array154).get(counter155);
                                if (union156 == null) {
                                    (encoder).writeIndex(0);
                                    (encoder).writeNull();
                                } else {
                                    if ((union156 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union156).getSchema().getFullName())) {
                                        (encoder).writeIndex(1);
                                        serializesubRecord140(((IndexedRecord) union156), (encoder));
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
    public void serializesubRecord140(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField141 = ((CharSequence) data.get(0));
        if (subField141 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField141 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField141 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField141));
                } else {
                    (encoder).writeString(subField141 .toString());
                }
            }
        }
    }

}
