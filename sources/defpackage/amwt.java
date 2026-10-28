package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amwt extends aihn implements aiis {
    public static final amwt a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int g;
    public int h;
    public boolean j;
    public String f = "";
    public String i = "";

    static {
        amwt amwtVar = new amwt();
        a = amwtVar;
        aihn.registerDefaultInstance(amwt.class, amwtVar);
    }

    private amwt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006င\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"b", "c", amoe.s, "d", "e", "f", "g", amys.c, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new amwt();
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
        return aihn.getParserForClass(amwt.class);
    }
}
