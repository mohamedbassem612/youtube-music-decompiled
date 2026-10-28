package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$AndroidStackInfo extends aihn implements aiis {
    public static final ClientErrorOuterClass$AndroidStackInfo a;
    public int b;
    public aigj c = aigj.d;

    static {
        ClientErrorOuterClass$AndroidStackInfo clientErrorOuterClass$AndroidStackInfo = new ClientErrorOuterClass$AndroidStackInfo();
        a = clientErrorOuterClass$AndroidStackInfo;
        aihn.registerDefaultInstance(ClientErrorOuterClass$AndroidStackInfo.class, clientErrorOuterClass$AndroidStackInfo);
    }

    private ClientErrorOuterClass$AndroidStackInfo() {
    }

    public static ClientErrorOuterClass$AndroidStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$AndroidStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$AndroidStackInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$AndroidStackInfo();
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
        return aihn.getParserForClass(ClientErrorOuterClass$AndroidStackInfo.class);
    }
}
