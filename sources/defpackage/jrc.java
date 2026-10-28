package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrc extends aihn implements aiis {
    public static final jrc a;
    public int b;
    public long f;
    public long h;
    public int i;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public aigj e = aigj.d;
    public String g = "";
    public String j = "";

    static {
        jrc jrcVar = new jrc();
        a = jrcVar;
        aihn.registerDefaultInstance(jrc.class, jrcVar);
    }

    private jrc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007င\u0006\bဈ\u0007\tဇ\b\n᠌\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", ajhk.u});
        }
        if (iOrdinal == 3) {
            return new jrc();
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
        return aihn.getParserForClass(jrc.class);
    }
}
