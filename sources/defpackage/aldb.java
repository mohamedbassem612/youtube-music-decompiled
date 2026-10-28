package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aldb extends aihn implements aiis {
    public static final aldb a;
    public int b;
    public int c;

    static {
        aldb aldbVar = new aldb();
        a = aldbVar;
        aihn.registerDefaultInstance(aldb.class, aldbVar);
    }

    private aldb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aldc.a});
        }
        if (iOrdinal == 3) {
            return new aldb();
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
        return aihn.getParserForClass(aldb.class);
    }
}
