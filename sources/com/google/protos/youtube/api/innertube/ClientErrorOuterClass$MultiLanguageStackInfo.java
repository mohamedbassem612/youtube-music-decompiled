package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$MultiLanguageStackInfo extends aihn implements aiis {
    public static final ClientErrorOuterClass$MultiLanguageStackInfo a;

    static {
        ClientErrorOuterClass$MultiLanguageStackInfo clientErrorOuterClass$MultiLanguageStackInfo = new ClientErrorOuterClass$MultiLanguageStackInfo();
        a = clientErrorOuterClass$MultiLanguageStackInfo;
        aihn.registerDefaultInstance(ClientErrorOuterClass$MultiLanguageStackInfo.class, clientErrorOuterClass$MultiLanguageStackInfo);
    }

    private ClientErrorOuterClass$MultiLanguageStackInfo() {
        emptyProtobufList();
    }

    public static ClientErrorOuterClass$MultiLanguageStackInfo getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$MultiLanguageStackInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$MultiLanguageStackInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$MultiLanguageStackInfo();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ClientErrorOuterClass$MultiLanguageStackInfo.class);
        }
        return null;
    }
}
