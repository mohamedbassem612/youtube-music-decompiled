package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.akpa;
import defpackage.akxc;
import defpackage.aoxy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaCommonConfigOuterClass$MediaCommonConfig extends aihn implements aiis {
    public static final MediaCommonConfigOuterClass$MediaCommonConfig a;
    public int b;
    public akpa c;
    public MediaCommonConfigOuterClass$MediaUstreamerRequestConfig d;
    public akxc e;
    public int f;
    public int g;
    public MediaCommonConfigOuterClass$ServerReadaheadConfig h;
    public boolean i;
    public MediaCommonConfigOuterClass$ServerPlaybackStartConfig j;
    public boolean k;
    public boolean l;
    public boolean m;
    public SabrPrefetchConfigOuterClass$SabrPrefetchConfig n;
    private aoxy o;

    static {
        MediaCommonConfigOuterClass$MediaCommonConfig mediaCommonConfigOuterClass$MediaCommonConfig = new MediaCommonConfigOuterClass$MediaCommonConfig();
        a = mediaCommonConfigOuterClass$MediaCommonConfig;
        aihn.registerDefaultInstance(MediaCommonConfigOuterClass$MediaCommonConfig.class, mediaCommonConfigOuterClass$MediaCommonConfig);
    }

    private MediaCommonConfigOuterClass$MediaCommonConfig() {
        emptyProtobufList();
    }

    public static MediaCommonConfigOuterClass$MediaCommonConfig getDefaultInstance() {
        return a;
    }

    public static MediaCommonConfigOuterClass$MediaCommonConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaCommonConfigOuterClass$MediaCommonConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001b\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006ဉ\u0005\bင\b\tင\u0006\nဉ\t\rဇ\u000b\u000fဉ\r\u0015ဇ\u0012\u0018ဇ\u0015\u001aဇ\u0017\u001bဉ\u0018", new Object[]{"b", "c", "d", "o", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new MediaCommonConfigOuterClass$MediaCommonConfig();
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
        return aihn.getParserForClass(MediaCommonConfigOuterClass$MediaCommonConfig.class);
    }
}
