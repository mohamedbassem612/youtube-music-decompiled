package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.apjs;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SabrSeekOuterClass$SabrSeek extends aihn implements aiis {
    public static final SabrSeekOuterClass$SabrSeek a;
    public long b;
    public int c;
    public int d;
    private int e;

    static {
        SabrSeekOuterClass$SabrSeek sabrSeekOuterClass$SabrSeek = new SabrSeekOuterClass$SabrSeek();
        a = sabrSeekOuterClass$SabrSeek;
        aihn.registerDefaultInstance(SabrSeekOuterClass$SabrSeek.class, sabrSeekOuterClass$SabrSeek);
    }

    private SabrSeekOuterClass$SabrSeek() {
    }

    public static SabrSeekOuterClass$SabrSeek getDefaultInstance() {
        return a;
    }

    public static SabrSeekOuterClass$SabrSeek parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SabrSeekOuterClass$SabrSeek) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"e", "b", "c", "d", apjs.q});
        }
        if (iOrdinal == 3) {
            return new SabrSeekOuterClass$SabrSeek();
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
        return aihn.getParserForClass(SabrSeekOuterClass$SabrSeek.class);
    }
}
