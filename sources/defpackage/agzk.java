package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class agzk extends aihn implements aiis {
    public static final agzk a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public agzh h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public agzj q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    static {
        agzk agzkVar = new agzk();
        a = agzkVar;
        aihn.registerDefaultInstance(agzk.class, agzkVar);
    }

    private agzk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0014\u0000\u0001\u0002\u0016\u0014\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", agzi.a, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
        }
        if (iOrdinal == 3) {
            return new agzk();
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
        return aihn.getParserForClass(agzk.class);
    }
}
