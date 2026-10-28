package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqkl extends aihn implements aiis {
    public static final aqkl a;
    public int b;
    public int c = 4;
    public int d = 5;
    public int e = 1;

    static {
        aqkl aqklVar = new aqkl();
        a = aqklVar;
        aihn.registerDefaultInstance(aqkl.class, aqklVar);
    }

    private aqkl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003᠌\u0000\u0004᠌\u0001\u0005᠌\u0002", new Object[]{"b", "c", aqkp.b, "d", aqkp.a, "e", aqgv.u});
        }
        if (iOrdinal == 3) {
            return new aqkl();
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
        return aihn.getParserForClass(aqkl.class);
    }
}
