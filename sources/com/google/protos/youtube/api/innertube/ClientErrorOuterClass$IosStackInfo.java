package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$IosStackInfo extends aihn implements aiis {
    public static final ClientErrorOuterClass$IosStackInfo a;

    static {
        ClientErrorOuterClass$IosStackInfo clientErrorOuterClass$IosStackInfo = new ClientErrorOuterClass$IosStackInfo();
        a = clientErrorOuterClass$IosStackInfo;
        aihn.registerDefaultInstance(ClientErrorOuterClass$IosStackInfo.class, clientErrorOuterClass$IosStackInfo);
    }

    private ClientErrorOuterClass$IosStackInfo() {
    }

    public static ClientErrorOuterClass$IosStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$IosStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$IosStackInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$IosStackInfo();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ClientErrorOuterClass$IosStackInfo.class);
        }
        return null;
    }
}
