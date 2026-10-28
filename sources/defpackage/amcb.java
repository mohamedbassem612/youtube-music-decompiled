package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amcb extends aihn implements aiis {
    public static final amcb a;
    public int b;
    public String c = "";
    public argn d;
    public amdd e;
    public int f;

    static {
        amcb amcbVar = new amcb();
        a = amcbVar;
        aihn.registerDefaultInstance(amcb.class, amcbVar);
    }

    private amcb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", allf.j});
        }
        if (iOrdinal == 3) {
            return new amcb();
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
        return aihn.getParserForClass(amcb.class);
    }
}
