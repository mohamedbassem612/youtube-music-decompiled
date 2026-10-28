package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.fxd;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class EndOfTrackOuterClass$EndOfTrack extends aihn implements aiis {
    public static final EndOfTrackOuterClass$EndOfTrack a;
    public int b = 1;
    private int c;

    static {
        EndOfTrackOuterClass$EndOfTrack endOfTrackOuterClass$EndOfTrack = new EndOfTrackOuterClass$EndOfTrack();
        a = endOfTrackOuterClass$EndOfTrack;
        aihn.registerDefaultInstance(EndOfTrackOuterClass$EndOfTrack.class, endOfTrackOuterClass$EndOfTrack);
    }

    private EndOfTrackOuterClass$EndOfTrack() {
    }

    public static EndOfTrackOuterClass$EndOfTrack getDefaultInstance() {
        return a;
    }

    public static EndOfTrackOuterClass$EndOfTrack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (EndOfTrackOuterClass$EndOfTrack) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", fxd.f});
        }
        if (iOrdinal == 3) {
            return new EndOfTrackOuterClass$EndOfTrack();
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
        return aihn.getParserForClass(EndOfTrackOuterClass$EndOfTrack.class);
    }
}
