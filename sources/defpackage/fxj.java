package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxj extends aihn implements aiis {
    public static final fxj a;
    public int b;
    public long r;
    public long s;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public int i = 1000;
    public long j = -1;
    public long k = -1;
    public long l = -1;
    public int m = 1000;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long t = -1;
    public long u = -1;

    static {
        fxj fxjVar = new fxj();
        a = fxjVar;
        aihn.registerDefaultInstance(fxj.class, fxjVar);
    }

    private fxj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = fxi.d;
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aihtVar, "j", "k", "l", "m", aihtVar, "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (iOrdinal == 3) {
            return new fxj();
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
        return aihn.getParserForClass(fxj.class);
    }
}
