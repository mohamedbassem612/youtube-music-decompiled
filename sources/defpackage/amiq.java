package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amiq extends aihn implements aiis {
    public static final amiq a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        amiq amiqVar = new amiq();
        a = amiqVar;
        aihn.registerDefaultInstance(amiq.class, amiqVar);
    }

    private amiq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amiq();
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
        return aihn.getParserForClass(amiq.class);
    }
}
