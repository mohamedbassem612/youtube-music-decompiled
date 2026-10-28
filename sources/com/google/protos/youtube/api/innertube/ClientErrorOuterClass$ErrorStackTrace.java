package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$ErrorStackTrace extends aihn implements aiis {
    public static final ClientErrorOuterClass$ErrorStackTrace a;
    public int b = 0;
    public Object c;

    static {
        ClientErrorOuterClass$ErrorStackTrace clientErrorOuterClass$ErrorStackTrace = new ClientErrorOuterClass$ErrorStackTrace();
        a = clientErrorOuterClass$ErrorStackTrace;
        aihn.registerDefaultInstance(ClientErrorOuterClass$ErrorStackTrace.class, clientErrorOuterClass$ErrorStackTrace);
    }

    private ClientErrorOuterClass$ErrorStackTrace() {
    }

    public static ClientErrorOuterClass$ErrorStackTrace getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$ErrorStackTrace parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$ErrorStackTrace) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", ClientErrorOuterClass$AndroidStackInfo.class, ClientErrorOuterClass$BrowserStackInfo.class, ClientErrorOuterClass$IosStackInfo.class, ClientErrorOuterClass$MultiLanguageStackInfo.class});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$ErrorStackTrace();
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
        return aihn.getParserForClass(ClientErrorOuterClass$ErrorStackTrace.class);
    }
}
