package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aotj;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaSource$MediaSourceInfo extends aihn implements aiis {
    public static final MediaSource$MediaSourceInfo a;
    public int b;
    public int c;
    private int d;

    static {
        MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = new MediaSource$MediaSourceInfo();
        a = mediaSource$MediaSourceInfo;
        aihn.registerDefaultInstance(MediaSource$MediaSourceInfo.class, mediaSource$MediaSourceInfo);
    }

    private MediaSource$MediaSourceInfo() {
    }

    public static MediaSource$MediaSourceInfo getDefaultInstance() {
        return a;
    }

    public static MediaSource$MediaSourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaSource$MediaSourceInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", aotj.m, "c", aotj.l});
        }
        if (iOrdinal == 3) {
            return new MediaSource$MediaSourceInfo();
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
        return aihn.getParserForClass(MediaSource$MediaSourceInfo.class);
    }
}
