package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alav extends aihn implements aiis {
    public static final alav a;
    public int b;
    public int c;
    public int d;
    private int e;

    static {
        alav alavVar = new alav();
        a = alavVar;
        aihn.registerDefaultInstance(alav.class, alavVar);
    }

    private alav() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003", new Object[]{"e", "b", akux.s, "c", akux.t, "d", akux.p});
        }
        if (iOrdinal == 3) {
            return new alav();
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
        return aihn.getParserForClass(alav.class);
    }
}
