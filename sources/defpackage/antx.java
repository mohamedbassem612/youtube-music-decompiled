package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antx extends aihn implements aiis {
    public static final antx a;
    public int b;
    public String c = "";
    public int d;
    public anty e;

    static {
        antx antxVar = new antx();
        a = antxVar;
        aihn.registerDefaultInstance(antx.class, antxVar);
    }

    private antx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", anms.u, "e"});
        }
        if (iOrdinal == 3) {
            return new antx();
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
        return aihn.getParserForClass(antx.class);
    }
}
