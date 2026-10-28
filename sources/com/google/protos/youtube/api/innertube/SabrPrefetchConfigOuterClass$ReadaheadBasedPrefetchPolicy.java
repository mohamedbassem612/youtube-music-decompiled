package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy extends aihn implements aiis {
    public static final SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy a;

    static {
        SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy sabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy = new SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy();
        a = sabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy;
        aihn.registerDefaultInstance(SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy.class, sabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy);
    }

    private SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy() {
        emptyLongList();
    }

    public static SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy getDefaultInstance() {
        return a;
    }

    public static SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(SabrPrefetchConfigOuterClass$ReadaheadBasedPrefetchPolicy.class);
        }
        return null;
    }
}
