package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzm extends aihn implements aiis {
    public static final jzm a;
    public int b;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public String m = "";

    static {
        jzm jzmVar = new jzm();
        a = jzmVar;
        aihn.registerDefaultInstance(jzm.class, jzmVar);
    }

    private jzm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဈ\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", fxd.i, "l", "m"});
        }
        if (iOrdinal == 3) {
            return new jzm();
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
        return aihn.getParserForClass(jzm.class);
    }
}
