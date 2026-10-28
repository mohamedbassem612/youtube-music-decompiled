package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaCommonConfigOuterClass$ServerPlaybackStartConfig extends aihn implements aiis {
    public static final MediaCommonConfigOuterClass$ServerPlaybackStartConfig a;
    public boolean b;
    private int c;

    static {
        MediaCommonConfigOuterClass$ServerPlaybackStartConfig mediaCommonConfigOuterClass$ServerPlaybackStartConfig = new MediaCommonConfigOuterClass$ServerPlaybackStartConfig();
        a = mediaCommonConfigOuterClass$ServerPlaybackStartConfig;
        aihn.registerDefaultInstance(MediaCommonConfigOuterClass$ServerPlaybackStartConfig.class, mediaCommonConfigOuterClass$ServerPlaybackStartConfig);
    }

    private MediaCommonConfigOuterClass$ServerPlaybackStartConfig() {
    }

    public static MediaCommonConfigOuterClass$ServerPlaybackStartConfig getDefaultInstance() {
        return a;
    }

    public static MediaCommonConfigOuterClass$ServerPlaybackStartConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaCommonConfigOuterClass$ServerPlaybackStartConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new MediaCommonConfigOuterClass$ServerPlaybackStartConfig();
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
        return aihn.getParserForClass(MediaCommonConfigOuterClass$ServerPlaybackStartConfig.class);
    }
}
