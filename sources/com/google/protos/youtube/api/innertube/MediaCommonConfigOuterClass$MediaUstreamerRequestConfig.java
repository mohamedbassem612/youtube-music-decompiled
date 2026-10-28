package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaCommonConfigOuterClass$MediaUstreamerRequestConfig extends aihn implements aiis {
    public static final MediaCommonConfigOuterClass$MediaUstreamerRequestConfig a;
    public int b;
    public boolean c;
    public aigj d = aigj.d;
    public boolean e;
    public boolean f;

    static {
        MediaCommonConfigOuterClass$MediaUstreamerRequestConfig mediaCommonConfigOuterClass$MediaUstreamerRequestConfig = new MediaCommonConfigOuterClass$MediaUstreamerRequestConfig();
        a = mediaCommonConfigOuterClass$MediaUstreamerRequestConfig;
        aihn.registerDefaultInstance(MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.class, mediaCommonConfigOuterClass$MediaUstreamerRequestConfig);
    }

    private MediaCommonConfigOuterClass$MediaUstreamerRequestConfig() {
    }

    public static MediaCommonConfigOuterClass$MediaUstreamerRequestConfig getDefaultInstance() {
        return a;
    }

    public static MediaCommonConfigOuterClass$MediaUstreamerRequestConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaCommonConfigOuterClass$MediaUstreamerRequestConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0004ည\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new MediaCommonConfigOuterClass$MediaUstreamerRequestConfig();
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
        return aihn.getParserForClass(MediaCommonConfigOuterClass$MediaUstreamerRequestConfig.class);
    }
}
