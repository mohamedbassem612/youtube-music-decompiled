package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqim extends aihn implements aiis {
    public static final aqim a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    private int u;

    static {
        aqim aqimVar = new aqim();
        a = aqimVar;
        aihn.registerDefaultInstance(aqim.class, aqimVar);
    }

    private aqim() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0013\u0000\u0001\u0001\u0018\u0013\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0005င\u0003\u0006င\u0004\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0011င\u000f\u0013င\u0011\u0014င\u0012\u0015င\u0013\u0017င\u0015\u0018င\u0016", new Object[]{"u", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
        }
        if (iOrdinal == 3) {
            return new aqim();
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
        return aihn.getParserForClass(aqim.class);
    }
}
