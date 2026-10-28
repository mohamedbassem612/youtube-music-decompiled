package com.google.protos.youtube.client.composition.runtime.api;

import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ExportInputConfigProto$ExportInputConfig extends aihn implements aiis {
    public static final ExportInputConfigProto$ExportInputConfig a;
    private byte b = 2;

    static {
        ExportInputConfigProto$ExportInputConfig exportInputConfigProto$ExportInputConfig = new ExportInputConfigProto$ExportInputConfig();
        a = exportInputConfigProto$ExportInputConfig;
        aihn.registerDefaultInstance(ExportInputConfigProto$ExportInputConfig.class, exportInputConfigProto$ExportInputConfig);
    }

    private ExportInputConfigProto$ExportInputConfig() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new ExportInputConfigProto$ExportInputConfig();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ExportInputConfigProto$ExportInputConfig.class);
            default:
                return null;
        }
    }
}
