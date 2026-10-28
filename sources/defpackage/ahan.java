package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahan extends aihn implements aiis {
    public static final ahan a;
    public int b;
    public int c;
    public ahai d;
    public int e;
    public int f;

    static {
        ahan ahanVar = new ahan();
        a = ahanVar;
        aihn.registerDefaultInstance(ahan.class, ahanVar);
    }

    private ahan() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", agzi.l, "d", "e", agzi.k, "f"});
        }
        if (iOrdinal == 3) {
            return new ahan();
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
        return aihn.getParserForClass(ahan.class);
    }
}
