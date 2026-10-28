package com.google.protos.youtube.javascript;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class JsVmStatisticsOuterClass$JsVmStatistics extends aihn implements aiis {
    public static final JsVmStatisticsOuterClass$JsVmStatistics a;

    static {
        JsVmStatisticsOuterClass$JsVmStatistics jsVmStatisticsOuterClass$JsVmStatistics = new JsVmStatisticsOuterClass$JsVmStatistics();
        a = jsVmStatisticsOuterClass$JsVmStatistics;
        aihn.registerDefaultInstance(JsVmStatisticsOuterClass$JsVmStatistics.class, jsVmStatisticsOuterClass$JsVmStatistics);
    }

    private JsVmStatisticsOuterClass$JsVmStatistics() {
    }

    public static JsVmStatisticsOuterClass$JsVmStatistics getDefaultInstance() {
        return a;
    }

    public static JsVmStatisticsOuterClass$JsVmStatistics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (JsVmStatisticsOuterClass$JsVmStatistics) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new JsVmStatisticsOuterClass$JsVmStatistics();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(JsVmStatisticsOuterClass$JsVmStatistics.class);
        }
        return null;
    }
}
