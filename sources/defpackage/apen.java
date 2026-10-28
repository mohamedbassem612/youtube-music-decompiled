package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apen extends aihn implements aiis {
    public static final apen a;
    public int b;
    public int e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        apen apenVar = new apen();
        a = apenVar;
        aihn.registerDefaultInstance(apen.class, apenVar);
    }

    private apen() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005᠌\u0004\bင\u0007\t᠌\b\nင\t\u000bင\n", new Object[]{"b", "c", "d", "e", "f", "g", apep.c, "h", "i", apep.d, "j", "k"});
        }
        if (iOrdinal == 3) {
            return new apen();
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
        return aihn.getParserForClass(apen.class);
    }
}
