package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class SabrPrefetchConfigOuterClass$SabrPrefetchConfig extends aihn implements aiis {
    public static final SabrPrefetchConfigOuterClass$SabrPrefetchConfig a;
    public int b = 0;
    public Object c;

    static {
        SabrPrefetchConfigOuterClass$SabrPrefetchConfig sabrPrefetchConfigOuterClass$SabrPrefetchConfig = new SabrPrefetchConfigOuterClass$SabrPrefetchConfig();
        a = sabrPrefetchConfigOuterClass$SabrPrefetchConfig;
        aihn.registerDefaultInstance(SabrPrefetchConfigOuterClass$SabrPrefetchConfig.class, sabrPrefetchConfigOuterClass$SabrPrefetchConfig);
    }

    private SabrPrefetchConfigOuterClass$SabrPrefetchConfig() {
    }

    public static SabrPrefetchConfigOuterClass$SabrPrefetchConfig getDefaultInstance() {
        return a;
    }

    public static SabrPrefetchConfigOuterClass$SabrPrefetchConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SabrPrefetchConfigOuterClass$SabrPrefetchConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"c", "b", SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy.class, SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy.class, SabrPrefetchConfigOuterClass$ContinuousBufferPrefetchPolicy.class});
        }
        if (iOrdinal == 3) {
            return new SabrPrefetchConfigOuterClass$SabrPrefetchConfig();
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
        return aihn.getParserForClass(SabrPrefetchConfigOuterClass$SabrPrefetchConfig.class);
    }
}
