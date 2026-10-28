package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwg extends aihn implements aiis {
    public static final ahwg a;
    public int b;
    public int c;

    static {
        ahwg ahwgVar = new ahwg();
        a = ahwgVar;
        aihn.registerDefaultInstance(ahwg.class, ahwgVar);
    }

    private ahwg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", fxi.q});
        }
        if (iOrdinal == 3) {
            return new ahwg();
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
        return aihn.getParserForClass(ahwg.class);
    }
}
