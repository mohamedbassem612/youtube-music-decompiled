package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class poy extends aihn implements aiis {
    public static final aihw a = new aiat(1);
    public static final poy b;
    public aihv c = emptyIntList();

    static {
        poy poyVar = new poy();
        b = poyVar;
        aihn.registerDefaultInstance(poy.class, poyVar);
    }

    private poy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", aidl.h});
        }
        if (iOrdinal == 3) {
            return new poy();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(poy.class);
    }
}
