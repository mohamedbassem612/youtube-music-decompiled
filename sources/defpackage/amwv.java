package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amwv extends aihn implements aiis {
    public static final amwv a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public String f = "";

    static {
        amwv amwvVar = new amwv();
        a = amwvVar;
        aihn.registerDefaultInstance(amwv.class, amwvVar);
    }

    private amwv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", amoe.u, "d", amys.i, "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amwv();
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
        return aihn.getParserForClass(amwv.class);
    }
}
