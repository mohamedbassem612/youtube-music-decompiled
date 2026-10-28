package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class PlaybackStartPolicyOuterClass$PlaybackStartPolicy extends aihn implements aiis {
    public static final PlaybackStartPolicyOuterClass$PlaybackStartPolicy a;

    static {
        PlaybackStartPolicyOuterClass$PlaybackStartPolicy playbackStartPolicyOuterClass$PlaybackStartPolicy = new PlaybackStartPolicyOuterClass$PlaybackStartPolicy();
        a = playbackStartPolicyOuterClass$PlaybackStartPolicy;
        aihn.registerDefaultInstance(PlaybackStartPolicyOuterClass$PlaybackStartPolicy.class, playbackStartPolicyOuterClass$PlaybackStartPolicy);
    }

    private PlaybackStartPolicyOuterClass$PlaybackStartPolicy() {
        emptyProtobufList();
        emptyProtobufList();
    }

    public static PlaybackStartPolicyOuterClass$PlaybackStartPolicy getDefaultInstance() {
        return a;
    }

    public static PlaybackStartPolicyOuterClass$PlaybackStartPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PlaybackStartPolicyOuterClass$PlaybackStartPolicy) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new PlaybackStartPolicyOuterClass$PlaybackStartPolicy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(PlaybackStartPolicyOuterClass$PlaybackStartPolicy.class);
        }
        return null;
    }
}
