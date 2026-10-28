package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alcu extends aihn implements aiis {
    public static final alcu a;
    public alct b;
    private int c;

    static {
        alcu alcuVar = new alcu();
        a = alcuVar;
        aihn.registerDefaultInstance(alcu.class, alcuVar);
    }

    private alcu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new alcu();
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
        return aihn.getParserForClass(alcu.class);
    }
}
