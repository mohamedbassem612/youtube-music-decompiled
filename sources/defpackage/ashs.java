package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ashs extends aihn implements aiis {
    public static final ashs a;
    public int b;
    public int c;
    public ajuj d;
    public int e;

    static {
        ashs ashsVar = new ashs();
        a = ashsVar;
        aihn.registerDefaultInstance(ashs.class, ashsVar);
    }

    private ashs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", ajpr.o, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ashs();
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
        return aihn.getParserForClass(ashs.class);
    }
}
