package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amiv extends aihn implements aiis {
    public static final amiv a;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        amiv amivVar = new amiv();
        a = amivVar;
        aihn.registerDefaultInstance(amiv.class, amivVar);
    }

    private amiv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", ajpr.q, "e", ajpr.p});
        }
        if (iOrdinal == 3) {
            return new amiv();
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
        return aihn.getParserForClass(amiv.class);
    }
}
