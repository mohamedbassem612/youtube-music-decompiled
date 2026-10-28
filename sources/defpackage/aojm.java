package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojm extends aihn implements aiis {
    public static final aihw a = new qle(9);
    public static final aojm b;
    public aigj c;
    public aigj d;
    public long e;
    public String f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public aihv o;
    public boolean p;
    public int q;
    public int r;
    private int s;
    private int t;

    static {
        aojm aojmVar = new aojm();
        b = aojmVar;
        aihn.registerDefaultInstance(aojm.class, aojmVar);
    }

    private aojm() {
        aigj aigjVar = aigj.d;
        this.c = aigjVar;
        this.d = aigjVar;
        this.f = "";
        this.o = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0010\u0000\u0002\u0001$\u0010\u0000\u0001\u0000\u0001ည\u0000\u0002ဂ\u0002\u0003ည\u0001\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\u000bဇ\n\u000eင\r\u000fင\u000e\u0010င\u000f\u0013င\u0012\u0019င\u0018 ࠬ\"ဇ #င!$င\"", new Object[]{"s", "t", "c", "e", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", ajhk.o, "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new aojm();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aojm.class);
    }
}
