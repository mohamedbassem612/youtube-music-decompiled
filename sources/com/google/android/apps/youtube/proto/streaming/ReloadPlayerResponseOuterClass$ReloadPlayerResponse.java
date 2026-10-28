package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aphs;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ReloadPlayerResponseOuterClass$ReloadPlayerResponse extends aihn implements aiis {
    public static final ReloadPlayerResponseOuterClass$ReloadPlayerResponse a;
    public aphs b;
    private int c;

    static {
        ReloadPlayerResponseOuterClass$ReloadPlayerResponse reloadPlayerResponseOuterClass$ReloadPlayerResponse = new ReloadPlayerResponseOuterClass$ReloadPlayerResponse();
        a = reloadPlayerResponseOuterClass$ReloadPlayerResponse;
        aihn.registerDefaultInstance(ReloadPlayerResponseOuterClass$ReloadPlayerResponse.class, reloadPlayerResponseOuterClass$ReloadPlayerResponse);
    }

    private ReloadPlayerResponseOuterClass$ReloadPlayerResponse() {
    }

    public static ReloadPlayerResponseOuterClass$ReloadPlayerResponse getDefaultInstance() {
        return a;
    }

    public static ReloadPlayerResponseOuterClass$ReloadPlayerResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ReloadPlayerResponseOuterClass$ReloadPlayerResponse) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ReloadPlayerResponseOuterClass$ReloadPlayerResponse();
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
        return aihn.getParserForClass(ReloadPlayerResponseOuterClass$ReloadPlayerResponse.class);
    }
}
