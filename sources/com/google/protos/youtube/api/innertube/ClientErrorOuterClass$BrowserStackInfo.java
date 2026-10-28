package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$BrowserStackInfo extends aihn implements aiis {
    public static final ClientErrorOuterClass$BrowserStackInfo a;

    static {
        ClientErrorOuterClass$BrowserStackInfo clientErrorOuterClass$BrowserStackInfo = new ClientErrorOuterClass$BrowserStackInfo();
        a = clientErrorOuterClass$BrowserStackInfo;
        aihn.registerDefaultInstance(ClientErrorOuterClass$BrowserStackInfo.class, clientErrorOuterClass$BrowserStackInfo);
    }

    private ClientErrorOuterClass$BrowserStackInfo() {
    }

    public static ClientErrorOuterClass$BrowserStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$BrowserStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$BrowserStackInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$BrowserStackInfo();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ClientErrorOuterClass$BrowserStackInfo.class);
        }
        return null;
    }
}
