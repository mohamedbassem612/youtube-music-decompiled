package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lmb extends aihn implements aiis {
    public static final lmb a;
    public int b = 0;
    public Object c;

    static {
        lmb lmbVar = new lmb();
        a = lmbVar;
        aihn.registerDefaultInstance(lmb.class, lmbVar);
    }

    private lmb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0007\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0007<\u0000", new Object[]{"c", "b", llz.class, lma.class, lly.class});
        }
        if (iOrdinal == 3) {
            return new lmb();
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
        return aihn.getParserForClass(lmb.class);
    }
}
