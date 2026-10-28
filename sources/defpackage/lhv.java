package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lhv extends aihn implements aiis {
    public static final lhv a;
    public int b;
    public int c;
    public boolean d;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        lhv lhvVar = new lhv();
        a = lhvVar;
        aihn.registerDefaultInstance(lhv.class, lhvVar);
    }

    private lhv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", fxd.l, "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new lhv();
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
        return aihn.getParserForClass(lhv.class);
    }
}
