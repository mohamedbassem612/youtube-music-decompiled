package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhy extends aihn implements aiis {
    public static final lhy a;
    public int b;
    public int c;
    private int d;

    static {
        lhy lhyVar = new lhy();
        a = lhyVar;
        aihn.registerDefaultInstance(lhy.class, lhyVar);
    }

    private lhy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", fxd.o, "c", fxd.n});
        }
        if (iOrdinal == 3) {
            return new lhy();
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
        return aihn.getParserForClass(lhy.class);
    }
}
