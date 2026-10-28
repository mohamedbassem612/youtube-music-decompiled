package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aihy;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy extends aihn implements aiis {
    public static final SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy a;
    public aihy b = emptyLongList();

    static {
        SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy sabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy = new SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy();
        a = sabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy;
        aihn.registerDefaultInstance(SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy.class, sabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy);
    }

    private SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy() {
    }

    public static SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy getDefaultInstance() {
        return a;
    }

    public static SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy();
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
        return aihn.getParserForClass(SabrPrefetchConfigOuterClass$PrefetchWindowBasedPrefetchPolicy.class);
    }
}
