package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig extends aihn implements aiis {
    public static final BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig a;
    public int b;
    private int c;

    static {
        BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig = new BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig();
        a = bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig;
        aihn.registerDefaultInstance(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig.class, bandwidthSamplingConfigOuterClass$BandwidthSamplingConfig);
    }

    private BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig() {
    }

    public static BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig getDefaultInstance() {
        return a;
    }

    public static BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig();
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
        return aihn.getParserForClass(BandwidthSamplingConfigOuterClass$BandwidthSamplingConfig.class);
    }
}
