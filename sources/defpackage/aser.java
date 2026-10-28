package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aser extends aihn implements aiis {
    public static final aser a;
    public int b;
    public int m;
    public boolean n;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String o = "";

    static {
        aser aserVar = new aser();
        a = aserVar;
        aihn.registerDefaultInstance(aser.class, aserVar);
    }

    private aser() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\f᠌\u000b\rဇ\f\u000eဈ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", amyr.u, "n", "o"});
        }
        if (iOrdinal == 3) {
            return new aser();
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
        return aihn.getParserForClass(aser.class);
    }
}
