package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class StitchedSegmentsMetadataOuterClass$VideoRegion extends aihn implements aiis {
    public static final StitchedSegmentsMetadataOuterClass$VideoRegion a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int g;

    static {
        StitchedSegmentsMetadataOuterClass$VideoRegion stitchedSegmentsMetadataOuterClass$VideoRegion = new StitchedSegmentsMetadataOuterClass$VideoRegion();
        a = stitchedSegmentsMetadataOuterClass$VideoRegion;
        aihn.registerDefaultInstance(StitchedSegmentsMetadataOuterClass$VideoRegion.class, stitchedSegmentsMetadataOuterClass$VideoRegion);
    }

    private StitchedSegmentsMetadataOuterClass$VideoRegion() {
    }

    public static StitchedSegmentsMetadataOuterClass$VideoRegion getDefaultInstance() {
        return a;
    }

    public static StitchedSegmentsMetadataOuterClass$VideoRegion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StitchedSegmentsMetadataOuterClass$VideoRegion) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new StitchedSegmentsMetadataOuterClass$VideoRegion();
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
        return aihn.getParserForClass(StitchedSegmentsMetadataOuterClass$VideoRegion.class);
    }
}
