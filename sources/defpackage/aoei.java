package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoei extends aihn implements aiis {
    public static final aoei a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public aqdf r;
    public String s;
    public aodz t;
    public aoeh u;
    public long v;
    public int w;
    public int x;

    static {
        aoei aoeiVar = new aoei();
        a = aoeiVar;
        aihn.registerDefaultInstance(aoei.class, aoeiVar);
    }

    private aoei() {
        emptyProtobufList();
        emptyProtobufList();
        this.s = "";
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001\u001f\u0016\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဋ\u0002\u0004ဂ\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဇ\u000b\u0010ဂ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဉ\u0012\u0015ဂ\u0003\u0016ဈ\u0013\u0017ဉ\u0014\u0018ဉ\u0015\u0019ဂ\u0016\u001b᠌\u0018\u001f᠌\u001c", new Object[]{"b", "c", "d", aocm.h, "e", "g", "h", aofw.n, "i", aobi.f, "j", "k", "l", "m", "n", "o", "p", "q", "r", "f", "s", "t", "u", "v", "w", aocm.t, "x", aocm.g});
        }
        if (iOrdinal == 3) {
            return new aoei();
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
        return aihn.getParserForClass(aoei.class);
    }
}
