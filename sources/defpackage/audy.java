package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audy extends aihn implements aiis {
    public static final audy a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        audy audyVar = new audy();
        a = audyVar;
        aihn.registerDefaultInstance(audy.class, audyVar);
    }

    private audy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", atxs.m, "d", atxs.o, "e", atxs.n, "f", atxs.p});
        }
        if (iOrdinal == 3) {
            return new audy();
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
        return aihn.getParserForClass(audy.class);
    }
}
