package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhs extends aihn implements aiis {
    public static final aqhs a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        aqhs aqhsVar = new aqhs();
        a = aqhsVar;
        aihn.registerDefaultInstance(aqhs.class, aqhsVar);
    }

    private aqhs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004᠌\u0001", new Object[]{"d", "c", "b", aoij.class, aqhp.class, "e", aqgv.e, "f", aqgv.c});
        }
        if (iOrdinal == 3) {
            return new aqhs();
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
        return aihn.getParserForClass(aqhs.class);
    }
}
