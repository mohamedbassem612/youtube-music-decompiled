package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antm extends aihn implements aiis {
    public static final antm a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        antm antmVar = new antm();
        a = antmVar;
        aihn.registerDefaultInstance(antm.class, antmVar);
    }

    private antm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", amyr.l, "d", amyr.k, "e", amyr.m, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new antm();
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
        return aihn.getParserForClass(antm.class);
    }
}
