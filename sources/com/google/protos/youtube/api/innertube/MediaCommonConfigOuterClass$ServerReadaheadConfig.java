package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaCommonConfigOuterClass$ServerReadaheadConfig extends aihn implements aiis {
    public static final MediaCommonConfigOuterClass$ServerReadaheadConfig a;
    public boolean b;
    public NextRequestPolicyOuterClass$NextRequestPolicy c;
    private int d;

    static {
        MediaCommonConfigOuterClass$ServerReadaheadConfig mediaCommonConfigOuterClass$ServerReadaheadConfig = new MediaCommonConfigOuterClass$ServerReadaheadConfig();
        a = mediaCommonConfigOuterClass$ServerReadaheadConfig;
        aihn.registerDefaultInstance(MediaCommonConfigOuterClass$ServerReadaheadConfig.class, mediaCommonConfigOuterClass$ServerReadaheadConfig);
    }

    private MediaCommonConfigOuterClass$ServerReadaheadConfig() {
    }

    public static MediaCommonConfigOuterClass$ServerReadaheadConfig getDefaultInstance() {
        return a;
    }

    public static MediaCommonConfigOuterClass$ServerReadaheadConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaCommonConfigOuterClass$ServerReadaheadConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new MediaCommonConfigOuterClass$ServerReadaheadConfig();
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
        return aihn.getParserForClass(MediaCommonConfigOuterClass$ServerReadaheadConfig.class);
    }
}
