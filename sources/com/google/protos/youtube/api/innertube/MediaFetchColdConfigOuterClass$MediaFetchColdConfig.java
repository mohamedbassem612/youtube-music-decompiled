package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaFetchColdConfigOuterClass$MediaFetchColdConfig extends aihn implements aiis {
    public static final MediaFetchColdConfigOuterClass$MediaFetchColdConfig a;
    public int b;
    public boolean c;
    public MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        MediaFetchColdConfigOuterClass$MediaFetchColdConfig mediaFetchColdConfigOuterClass$MediaFetchColdConfig = new MediaFetchColdConfigOuterClass$MediaFetchColdConfig();
        a = mediaFetchColdConfigOuterClass$MediaFetchColdConfig;
        aihn.registerDefaultInstance(MediaFetchColdConfigOuterClass$MediaFetchColdConfig.class, mediaFetchColdConfigOuterClass$MediaFetchColdConfig);
    }

    private MediaFetchColdConfigOuterClass$MediaFetchColdConfig() {
        emptyLongList();
    }

    public static MediaFetchColdConfigOuterClass$MediaFetchColdConfig getDefaultInstance() {
        return a;
    }

    public static MediaFetchColdConfigOuterClass$MediaFetchColdConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaFetchColdConfigOuterClass$MediaFetchColdConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u0018\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဇ\u0002\u0007ဇ\u0005\bဇ\u0006\u000eဇ\f\u000fဇ\r\u0011ဇ\u000f\u0018ဇ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new MediaFetchColdConfigOuterClass$MediaFetchColdConfig();
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
        return aihn.getParserForClass(MediaFetchColdConfigOuterClass$MediaFetchColdConfig.class);
    }
}
