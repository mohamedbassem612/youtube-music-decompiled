package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion extends aihn implements aiis {
    public static final StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion a;
    public int b;
    public StitchedSegmentsMetadataOuterClass$VideoRegion c;
    public TimeRangeOuterClass$TimeRange d;
    public String e = "";

    static {
        StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion = new StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion();
        a = stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion;
        aihn.registerDefaultInstance(StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.class, stitchedSegmentsMetadataOuterClass$StitchedSegmentPortion);
    }

    private StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion() {
        aigj aigjVar = aigj.d;
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion getDefaultInstance() {
        return a;
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.class);
    }
}
