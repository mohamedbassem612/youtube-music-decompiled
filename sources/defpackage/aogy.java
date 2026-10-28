package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aogy extends aihn implements aiis {
    public static final aogy a;
    public boolean A;
    public boolean B;
    public int b;
    public int c;
    public int g;
    public int h;
    public int i;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public aigj z;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String s = "";

    static {
        aogy aogyVar = new aogy();
        a = aogyVar;
        aihn.registerDefaultInstance(aogy.class, aogyVar);
    }

    private aogy() {
        emptyProtobufList();
        this.z = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u0001*\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0004\u0003᠌\u0005\u0004ဂ\b\u0005ဂ\t\u0007᠌\u000e\bဇ\u000f\t᠌\u0010\nဈ\u0013\u000b᠌\u0014\rဋ\u0017\u000fဇ\u0019\u0014ဈ\u0001\u0015ဂ\n\u0016ဂ\u000b\u0017ဂ\f\u001d᠌\u0015\u001eဈ\u0002!᠌!$ဇ$%ဈ\u0007&᠌\u0003'ည%(ဇ&*ဇ'", new Object[]{"b", "c", "d", "h", aofw.j, "i", aofw.i, "k", "l", "p", akkx.c, "q", "r", aobi.f, "s", "t", aofw.n, "v", "w", "e", "m", "n", "o", "u", aocm.e, "f", "x", aofw.h, "y", "j", "g", aofw.k, "z", "A", "B"});
        }
        if (iOrdinal == 3) {
            return new aogy();
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
        return aihn.getParserForClass(aogy.class);
    }
}
