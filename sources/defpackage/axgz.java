package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axgz extends aihn implements aiis {
    public static final axgz a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public axgy u;
    public axgy v;
    public aiip w = aiip.a;

    static {
        axgz axgzVar = new axgz();
        a = axgzVar;
        aihn.registerDefaultInstance(axgz.class, axgzVar);
    }

    private axgz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", new ahud(aika.INT32, (Object) 0, aika.INT64, (Object) 0L), "g", "j", "h", "m", "n", "s", axhk.b, "o", "p", "t"});
        }
        if (iOrdinal == 3) {
            return new axgz();
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
        return aihn.getParserForClass(axgz.class);
    }
}
