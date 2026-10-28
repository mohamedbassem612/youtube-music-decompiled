package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackDebugInfoOuterClass$DebugInfo extends aihn implements aiis {
    public static final PlaybackDebugInfoOuterClass$DebugInfo a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        PlaybackDebugInfoOuterClass$DebugInfo playbackDebugInfoOuterClass$DebugInfo = new PlaybackDebugInfoOuterClass$DebugInfo();
        a = playbackDebugInfoOuterClass$DebugInfo;
        aihn.registerDefaultInstance(PlaybackDebugInfoOuterClass$DebugInfo.class, playbackDebugInfoOuterClass$DebugInfo);
    }

    private PlaybackDebugInfoOuterClass$DebugInfo() {
    }

    public static PlaybackDebugInfoOuterClass$DebugInfo getDefaultInstance() {
        return a;
    }

    public static PlaybackDebugInfoOuterClass$DebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PlaybackDebugInfoOuterClass$DebugInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new PlaybackDebugInfoOuterClass$DebugInfo();
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
        return aihn.getParserForClass(PlaybackDebugInfoOuterClass$DebugInfo.class);
    }
}
