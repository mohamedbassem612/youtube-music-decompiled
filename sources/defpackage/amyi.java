package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyi extends aihn implements aiis {
    public static final amyi a;
    public int b;
    public int c;
    public amyj d;
    public String e = "";

    static {
        amyi amyiVar = new amyi();
        a = amyiVar;
        aihn.registerDefaultInstance(amyi.class, amyiVar);
    }

    private amyi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", allf.t, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amyi();
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
        return aihn.getParserForClass(amyi.class);
    }
}
