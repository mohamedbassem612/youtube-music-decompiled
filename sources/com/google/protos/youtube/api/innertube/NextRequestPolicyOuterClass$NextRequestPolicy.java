package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class NextRequestPolicyOuterClass$NextRequestPolicy extends aihn implements aiis {
    public static final NextRequestPolicyOuterClass$NextRequestPolicy a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aigj g = aigj.d;

    static {
        NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy = new NextRequestPolicyOuterClass$NextRequestPolicy();
        a = nextRequestPolicyOuterClass$NextRequestPolicy;
        aihn.registerDefaultInstance(NextRequestPolicyOuterClass$NextRequestPolicy.class, nextRequestPolicyOuterClass$NextRequestPolicy);
    }

    private NextRequestPolicyOuterClass$NextRequestPolicy() {
    }

    public static NextRequestPolicyOuterClass$NextRequestPolicy getDefaultInstance() {
        return a;
    }

    public static NextRequestPolicyOuterClass$NextRequestPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (NextRequestPolicyOuterClass$NextRequestPolicy) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new NextRequestPolicyOuterClass$NextRequestPolicy();
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
        return aihn.getParserForClass(NextRequestPolicyOuterClass$NextRequestPolicy.class);
    }
}
