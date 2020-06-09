
package com.linkedin.avro.fastserde.generated.serialization.AVRO_1_4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.linkedin.avro.fastserde.FastSerializer;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.io.Encoder;
import org.apache.avro.util.Utf8;

public class FastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField_GenericSerializer_4869519538077502381
    implements FastSerializer<IndexedRecord>
{


    public void serialize(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField120(data, (encoder));
    }

    @SuppressWarnings("unchecked")
    public void serializeFastGenericSerializerGeneratorTest_shouldWriteSubRecordCollectionsField120(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        List<IndexedRecord> recordsArray121 = ((List<IndexedRecord> ) data.get(0));
        (encoder).writeArrayStart();
        if ((recordsArray121 == null)||recordsArray121 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsArray121 .size());
            for (int counter122 = 0; (counter122 <((List<IndexedRecord> ) recordsArray121).size()); counter122 ++) {
                (encoder).startItem();
                IndexedRecord subRecord123 = null;
                subRecord123 = ((List<IndexedRecord> ) recordsArray121).get(counter122);
                serializesubRecord124(subRecord123, (encoder));
            }
        }
        (encoder).writeArrayEnd();
        Map<CharSequence, IndexedRecord> recordsMap126 = ((Map<CharSequence, IndexedRecord> ) data.get(1));
        (encoder).writeMapStart();
        if ((recordsMap126 == null)||recordsMap126 .isEmpty()) {
            (encoder).setItemCount(0);
        } else {
            (encoder).setItemCount(recordsMap126 .size());
            for (CharSequence key127 : ((Map<CharSequence, IndexedRecord> ) recordsMap126).keySet()) {
                (encoder).startItem();
                (encoder).writeString(key127);
                IndexedRecord subRecord128 = null;
                subRecord128 = ((Map<CharSequence, IndexedRecord> ) recordsMap126).get(key127);
                serializesubRecord124(subRecord128, (encoder));
            }
        }
        (encoder).writeMapEnd();
        List<IndexedRecord> recordsArrayUnion129 = ((List<IndexedRecord> ) data.get(2));
        if (recordsArrayUnion129 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsArrayUnion129 instanceof List) {
                (encoder).writeIndex(1);
                (encoder).writeArrayStart();
                if ((((List<IndexedRecord> ) recordsArrayUnion129) == null)||((List<IndexedRecord> ) recordsArrayUnion129).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((List<IndexedRecord> ) recordsArrayUnion129).size());
                    for (int counter130 = 0; (counter130 <((List<IndexedRecord> )((List<IndexedRecord> ) recordsArrayUnion129)).size()); counter130 ++) {
                        (encoder).startItem();
                        IndexedRecord union131 = null;
                        union131 = ((List<IndexedRecord> )((List<IndexedRecord> ) recordsArrayUnion129)).get(counter130);
                        if (union131 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union131 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union131).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord124(((IndexedRecord) union131), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeArrayEnd();
            }
        }
        Map<CharSequence, IndexedRecord> recordsMapUnion132 = ((Map<CharSequence, IndexedRecord> ) data.get(3));
        if (recordsMapUnion132 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (recordsMapUnion132 instanceof Map) {
                (encoder).writeIndex(1);
                (encoder).writeMapStart();
                if ((((Map<CharSequence, IndexedRecord> ) recordsMapUnion132) == null)||((Map<CharSequence, IndexedRecord> ) recordsMapUnion132).isEmpty()) {
                    (encoder).setItemCount(0);
                } else {
                    (encoder).setItemCount(((Map<CharSequence, IndexedRecord> ) recordsMapUnion132).size());
                    for (CharSequence key133 : ((Map<CharSequence, IndexedRecord> )((Map<CharSequence, IndexedRecord> ) recordsMapUnion132)).keySet()) {
                        (encoder).startItem();
                        (encoder).writeString(key133);
                        IndexedRecord union134 = null;
                        union134 = ((Map<CharSequence, IndexedRecord> )((Map<CharSequence, IndexedRecord> ) recordsMapUnion132)).get(key133);
                        if (union134 == null) {
                            (encoder).writeIndex(0);
                            (encoder).writeNull();
                        } else {
                            if ((union134 instanceof IndexedRecord)&&"com.adpilot.utils.generated.avro.subRecord".equals(((IndexedRecord) union134).getSchema().getFullName())) {
                                (encoder).writeIndex(1);
                                serializesubRecord124(((IndexedRecord) union134), (encoder));
                            }
                        }
                    }
                }
                (encoder).writeMapEnd();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void serializesubRecord124(IndexedRecord data, Encoder encoder)
        throws IOException
    {
        CharSequence subField125 = ((CharSequence) data.get(0));
        if (subField125 == null) {
            (encoder).writeIndex(0);
            (encoder).writeNull();
        } else {
            if (subField125 instanceof CharSequence) {
                (encoder).writeIndex(1);
                if (subField125 instanceof Utf8) {
                    (encoder).writeString(((Utf8) subField125));
                } else {
                    (encoder).writeString(subField125 .toString());
                }
            }
        }
    }

}
