package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig extends aihn implements aiis {
    public static final ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    static {
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig = new ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig();
        a = manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
        aihn.registerDefaultInstance(ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.class, manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig);
    }

    private ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig() {
    }

    public static ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig getDefaultInstance() {
        return a;
    }

    public static ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig();
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
        return aihn.getParserForClass(ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.class);
    }
}
