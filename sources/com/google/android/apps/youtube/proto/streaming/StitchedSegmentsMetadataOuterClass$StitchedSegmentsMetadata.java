package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.jrs;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata extends aihn implements jrs {
    public static final StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata a;
    public aiie b = emptyProtobufList();

    static {
        StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata = new StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata();
        a = stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata;
        aihn.registerDefaultInstance(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.class, stitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata);
    }

    private StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata() {
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata getDefaultInstance() {
        return a;
    }

    public static StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", StitchedSegmentsMetadataOuterClass$StitchedSegmentPortion.class});
        }
        if (iOrdinal == 3) {
            return new StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata();
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
        return aihn.getParserForClass(StitchedSegmentsMetadataOuterClass$StitchedSegmentsMetadata.class);
    }
}
