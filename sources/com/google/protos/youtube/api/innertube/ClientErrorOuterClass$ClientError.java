package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.ajtx;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ClientErrorOuterClass$ClientError extends aihn implements aiis {
    public static final ClientErrorOuterClass$ClientError a;
    public int b;
    public ClientErrorOuterClass$ErrorMetaData c;
    public ClientErrorOuterClass$ErrorStackTrace d;
    public ClientErrorOuterClass$LogMessage e;

    static {
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = new ClientErrorOuterClass$ClientError();
        a = clientErrorOuterClass$ClientError;
        aihn.registerDefaultInstance(ClientErrorOuterClass$ClientError.class, clientErrorOuterClass$ClientError);
    }

    private ClientErrorOuterClass$ClientError() {
    }

    public static ClientErrorOuterClass$ClientError getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$ClientError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$ClientError) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$ClientError();
        }
        if (iOrdinal == 4) {
            return new ajtx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ClientErrorOuterClass$ClientError.class);
    }
}
