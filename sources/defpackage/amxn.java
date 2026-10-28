package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxn extends aihn implements aiis {
    public static final amxn a;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public amwt g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public long l;
    public amxg m;
    public String n = "";
    public long o;
    public amwy p;
    public amwu q;
    public boolean r;

    static {
        amxn amxnVar = new amxn();
        a = amxnVar;
        aihn.registerDefaultInstance(amxn.class, amxnVar);
    }

    private amxn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0002\u0004ဂ\u0003\u0006ဇ\u0005\u0007ဉ\u0006\bဇ\u0007\t᠌\b\nင\t\u000b᠌\n\fဂ\u000b\rဉ\f\u000eဈ\r\u000fဂ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဇ\u0011", new Object[]{"b", "c", amys.i, "d", amys.a, "e", "f", "g", "h", "i", amys.g, "j", "k", amys.h, "l", "m", "n", "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new amxn();
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
        return aihn.getParserForClass(amxn.class);
    }
}
