package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aixv extends aihn implements aiis {
    public static final aixv a;
    public int b;
    public Object d;
    public int g;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        aixv aixvVar = new aixv();
        a = aixvVar;
        aihn.registerDefaultInstance(aixv.class, aixvVar);
    }

    private aixv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u083f\u0000\u0004\u083f\u0000\u0005\u083f\u0000\u0006\u083f\u0000\u0007᠌\u0002", new Object[]{"d", "c", "b", "e", "f", aiwd.q, aiwd.o, aiwd.n, aiwd.p, "g", aomi.s});
        }
        if (iOrdinal == 3) {
            return new aixv();
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
        return aihn.getParserForClass(aixv.class);
    }
}
