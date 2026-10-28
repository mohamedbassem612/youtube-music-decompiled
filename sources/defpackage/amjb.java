package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjb extends aihn implements aiis {
    public static final amjb a;
    public int b;
    public int d;
    public int e;
    public boolean h;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        amjb amjbVar = new amjb();
        a = amjbVar;
        aihn.registerDefaultInstance(amjb.class, amjbVar);
    }

    private amjb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004᠌\u0001\u0005᠌\u0002\u0006ဇ\u0005", new Object[]{"b", "c", "f", "g", "d", amys.q, "e", amys.u, "h"});
        }
        if (iOrdinal == 3) {
            return new amjb();
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
        return aihn.getParserForClass(amjb.class);
    }
}
