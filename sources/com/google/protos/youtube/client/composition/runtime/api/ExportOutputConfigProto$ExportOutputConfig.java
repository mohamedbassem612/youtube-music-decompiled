package com.google.protos.youtube.client.composition.runtime.api;

import defpackage.ahud;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiip;
import defpackage.aiis;
import defpackage.aika;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ExportOutputConfigProto$ExportOutputConfig extends aihn implements aiis {
    public static final ExportOutputConfigProto$ExportOutputConfig a;
    private aiip b = aiip.a;

    static {
        ExportOutputConfigProto$ExportOutputConfig exportOutputConfigProto$ExportOutputConfig = new ExportOutputConfigProto$ExportOutputConfig();
        a = exportOutputConfigProto$ExportOutputConfig;
        aihn.registerDefaultInstance(ExportOutputConfigProto$ExportOutputConfig.class, exportOutputConfigProto$ExportOutputConfig);
    }

    private ExportOutputConfigProto$ExportOutputConfig() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", new ahud(aikaVar, "", aikaVar, "")});
        }
        if (iOrdinal == 3) {
            return new ExportOutputConfigProto$ExportOutputConfig();
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
        return aihn.getParserForClass(ExportOutputConfigProto$ExportOutputConfig.class);
    }
}
