package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo extends aihn implements aiis {
    public static final ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo a;
    public int b;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;

    static {
        ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo = new ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo();
        a = serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo;
        aihn.registerDefaultInstance(ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo.class, serverStitchedDaiInfoOuterClass$ServerStitchedDaiInfo);
    }

    private ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo() {
    }

    public static ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo getDefaultInstance() {
        return a;
    }

    public static ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ည\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo();
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
        return aihn.getParserForClass(ServerStitchedDaiInfoOuterClass$ServerStitchedDaiInfo.class);
    }
}
