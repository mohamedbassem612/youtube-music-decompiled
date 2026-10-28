package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arba extends aihn implements aiis {
    public static final arba a;
    public int b;
    public arbb c;

    static {
        arba arbaVar = new arba();
        a = arbaVar;
        aihn.registerDefaultInstance(arba.class, arbaVar);
    }

    private arba() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf0af㮏\uf0af㮏\u0001\u0000\u0000\u0000\uf0af㮏ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new arba();
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
        return aihn.getParserForClass(arba.class);
    }
}
