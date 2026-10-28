package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class LivePlayerConfigOuterClass$LivePlayerConfig extends aihn implements aiis {
    public static final LivePlayerConfigOuterClass$LivePlayerConfig a;
    public int b;
    public double c;
    public boolean d;
    public boolean e;
    public double f;
    public boolean g;

    static {
        LivePlayerConfigOuterClass$LivePlayerConfig livePlayerConfigOuterClass$LivePlayerConfig = new LivePlayerConfigOuterClass$LivePlayerConfig();
        a = livePlayerConfigOuterClass$LivePlayerConfig;
        aihn.registerDefaultInstance(LivePlayerConfigOuterClass$LivePlayerConfig.class, livePlayerConfigOuterClass$LivePlayerConfig);
    }

    private LivePlayerConfigOuterClass$LivePlayerConfig() {
    }

    public static LivePlayerConfigOuterClass$LivePlayerConfig getDefaultInstance() {
        return a;
    }

    public static LivePlayerConfigOuterClass$LivePlayerConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LivePlayerConfigOuterClass$LivePlayerConfig) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001က\u0000\u0002ဇ\u0001\u0006ဇ\u0002\u0007က\u0006\bဇ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new LivePlayerConfigOuterClass$LivePlayerConfig();
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
        return aihn.getParserForClass(LivePlayerConfigOuterClass$LivePlayerConfig.class);
    }
}
