package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lly extends aihn implements aiis {
    public static final lly a;
    public int b;
    public int c;
    public int d;

    static {
        lly llyVar = new lly();
        a = llyVar;
        aihn.registerDefaultInstance(lly.class, llyVar);
    }

    private lly() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", fxi.h, "d", fxi.g});
        }
        if (iOrdinal == 3) {
            return new lly();
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
        return aihn.getParserForClass(lly.class);
    }
}
