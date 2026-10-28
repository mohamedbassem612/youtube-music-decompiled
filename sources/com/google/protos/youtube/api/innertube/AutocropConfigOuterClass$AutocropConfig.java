package com.google.protos.youtube.api.innertube;

import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.ajii;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class AutocropConfigOuterClass$AutocropConfig extends aihn implements aiis {
    public static final AutocropConfigOuterClass$AutocropConfig a;
    public ajii b;
    public boolean c;
    private int d;

    static {
        AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig = new AutocropConfigOuterClass$AutocropConfig();
        a = autocropConfigOuterClass$AutocropConfig;
        aihn.registerDefaultInstance(AutocropConfigOuterClass$AutocropConfig.class, autocropConfigOuterClass$AutocropConfig);
    }

    private AutocropConfigOuterClass$AutocropConfig() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဇ\u0002", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new AutocropConfigOuterClass$AutocropConfig();
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
        return aihn.getParserForClass(AutocropConfigOuterClass$AutocropConfig.class);
    }
}
