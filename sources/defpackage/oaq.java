package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oaq extends aihn implements aiis {
    public static final oaq a;
    public boolean A;
    public boolean B;
    public int b;
    public int c;
    public boolean f;
    public int h;
    public oax j;
    public oay m;
    public boolean x;
    public int d = 1;
    public boolean e = true;
    public String g = "unknown_host";
    public boolean i = true;
    public long k = 100;
    public long l = 2000;
    public long n = 10;
    public long o = 100;
    public long p = 20000;
    public String q = "";
    public String r = "";
    public long s = 500;
    public long t = 3000;
    public boolean u = true;
    public boolean v = true;
    public boolean w = true;
    public boolean y = true;
    public boolean z = true;

    static {
        oaq oaqVar = new oaq();
        a = oaqVar;
        aihn.registerDefaultInstance(oaq.class, oaqVar);
    }

    private oaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = fxi.i;
            return newMessageInfo(a, "\u0004\u001a\u0000\u0001\u0001\u001d\u001a\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b", new Object[]{"b", "c", aihtVar, "g", "i", "j", "l", "m", "e", "n", "o", "p", "q", "r", "s", "t", "u", "k", "v", "w", "x", "d", aihtVar, "f", "h", "y", "z", "A", "B"});
        }
        if (iOrdinal == 3) {
            return new oaq();
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
        return aihn.getParserForClass(oaq.class);
    }
}
