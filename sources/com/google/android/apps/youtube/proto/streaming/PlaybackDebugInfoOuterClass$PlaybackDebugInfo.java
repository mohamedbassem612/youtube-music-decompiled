package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackDebugInfoOuterClass$PlaybackDebugInfo extends aihn implements aiis {
    public static final PlaybackDebugInfoOuterClass$PlaybackDebugInfo a;
    public int b;
    public PlaybackDebugInfoOuterClass$InternalDebugInfo c;

    static {
        PlaybackDebugInfoOuterClass$PlaybackDebugInfo playbackDebugInfoOuterClass$PlaybackDebugInfo = new PlaybackDebugInfoOuterClass$PlaybackDebugInfo();
        a = playbackDebugInfoOuterClass$PlaybackDebugInfo;
        aihn.registerDefaultInstance(PlaybackDebugInfoOuterClass$PlaybackDebugInfo.class, playbackDebugInfoOuterClass$PlaybackDebugInfo);
    }

    private PlaybackDebugInfoOuterClass$PlaybackDebugInfo() {
    }

    public static PlaybackDebugInfoOuterClass$PlaybackDebugInfo getDefaultInstance() {
        return a;
    }

    public static PlaybackDebugInfoOuterClass$PlaybackDebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PlaybackDebugInfoOuterClass$PlaybackDebugInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new PlaybackDebugInfoOuterClass$PlaybackDebugInfo();
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
        return aihn.getParserForClass(PlaybackDebugInfoOuterClass$PlaybackDebugInfo.class);
    }
}
