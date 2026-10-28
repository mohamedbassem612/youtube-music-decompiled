package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.ajpr;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$LogMessage extends aihn implements aiis {
    public static final ClientErrorOuterClass$LogMessage a;
    public int b;
    public int d;
    public int f;
    public float g;
    public String c = "";
    public String e = "";

    static {
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = new ClientErrorOuterClass$LogMessage();
        a = clientErrorOuterClass$LogMessage;
        aihn.registerDefaultInstance(ClientErrorOuterClass$LogMessage.class, clientErrorOuterClass$LogMessage);
    }

    private ClientErrorOuterClass$LogMessage() {
    }

    public static ClientErrorOuterClass$LogMessage getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$LogMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$LogMessage) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0006င\u0004\u0007ခ\u0005", new Object[]{"b", "c", "d", ajpr.l, "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$LogMessage();
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
        return aihn.getParserForClass(ClientErrorOuterClass$LogMessage.class);
    }
}
