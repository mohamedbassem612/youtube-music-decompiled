package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyd extends aihn implements aiis {
    public static final amyd a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;

    static {
        amyd amydVar = new amyd();
        a = amydVar;
        aihn.registerDefaultInstance(amyd.class, amydVar);
    }

    private amyd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", amys.g, "e"});
        }
        if (iOrdinal == 3) {
            return new amyd();
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
        return aihn.getParserForClass(amyd.class);
    }
}
