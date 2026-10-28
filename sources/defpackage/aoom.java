package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoom extends aihn implements aiis {
    public static final aoom a;
    public static final aihl b;
    public int c;
    public int e;
    public boolean g;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public aigj d = aigj.d;
    public String f = "";
    public String h = "";
    public String m = "";

    static {
        aoom aoomVar = new aoom();
        a = aoomVar;
        aihn.registerDefaultInstance(aoom.class, aoomVar);
        b = aihn.newSingularGeneratedExtension(aofg.b, aoomVar, aoomVar, null, 230806702, aika.MESSAGE, aoom.class);
    }

    private aoom() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007င\u0006\t᠌\b\u000b᠌\n\f᠌\u000b\rဈ\f\u000eဇ\r\u000fဇ\u000e", new Object[]{"c", "d", "e", aofw.n, "f", "g", "h", "i", "j", akjs.j, "k", aobi.f, "l", aqkp.u, "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new aoom();
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
        return aihn.getParserForClass(aoom.class);
    }
}
