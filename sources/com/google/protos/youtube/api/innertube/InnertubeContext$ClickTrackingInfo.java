package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.argn;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class InnertubeContext$ClickTrackingInfo extends aihn implements aiis {
    public static final InnertubeContext$ClickTrackingInfo a;
    public int b;
    public aigj c = aigj.d;
    public argn d;

    static {
        InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo = new InnertubeContext$ClickTrackingInfo();
        a = innertubeContext$ClickTrackingInfo;
        aihn.registerDefaultInstance(InnertubeContext$ClickTrackingInfo.class, innertubeContext$ClickTrackingInfo);
    }

    private InnertubeContext$ClickTrackingInfo() {
    }

    public static InnertubeContext$ClickTrackingInfo getDefaultInstance() {
        return a;
    }

    public static InnertubeContext$ClickTrackingInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeContext$ClickTrackingInfo) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new InnertubeContext$ClickTrackingInfo();
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
        return aihn.getParserForClass(InnertubeContext$ClickTrackingInfo.class);
    }
}
