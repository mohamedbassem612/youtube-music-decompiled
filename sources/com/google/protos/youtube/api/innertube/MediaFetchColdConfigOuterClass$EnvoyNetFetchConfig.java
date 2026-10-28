package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig extends aihn implements aiis {
    public static final MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig a;
    public boolean b;
    private int c;

    static {
        MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig = new MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig();
        a = mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig;
        aihn.registerDefaultInstance(MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig.class, mediaFetchColdConfigOuterClass$EnvoyNetFetchConfig);
    }

    private MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig() {
        emptyProtobufList();
        emptyProtobufList();
    }

    public static MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig getDefaultInstance() {
        return a;
    }

    public static MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဇ\n", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig();
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
        return aihn.getParserForClass(MediaFetchColdConfigOuterClass$EnvoyNetFetchConfig.class);
    }
}
