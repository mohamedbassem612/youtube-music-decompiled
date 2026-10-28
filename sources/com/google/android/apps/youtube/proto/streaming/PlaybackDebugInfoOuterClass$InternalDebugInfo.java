package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackDebugInfoOuterClass$InternalDebugInfo extends aihn implements aiis {
    public static final PlaybackDebugInfoOuterClass$InternalDebugInfo a;
    public aiie b = emptyProtobufList();

    static {
        PlaybackDebugInfoOuterClass$InternalDebugInfo playbackDebugInfoOuterClass$InternalDebugInfo = new PlaybackDebugInfoOuterClass$InternalDebugInfo();
        a = playbackDebugInfoOuterClass$InternalDebugInfo;
        aihn.registerDefaultInstance(PlaybackDebugInfoOuterClass$InternalDebugInfo.class, playbackDebugInfoOuterClass$InternalDebugInfo);
    }

    private PlaybackDebugInfoOuterClass$InternalDebugInfo() {
    }

    public static PlaybackDebugInfoOuterClass$InternalDebugInfo getDefaultInstance() {
        return a;
    }

    public static PlaybackDebugInfoOuterClass$InternalDebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PlaybackDebugInfoOuterClass$InternalDebugInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", PlaybackDebugInfoOuterClass$FormatDebugInfo.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackDebugInfoOuterClass$InternalDebugInfo();
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
        return aihn.getParserForClass(PlaybackDebugInfoOuterClass$InternalDebugInfo.class);
    }
}
