package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpq extends aihn implements aiis {
    public static final atpq a;
    public int b;
    public aklo c;
    public long d;
    public String e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public aiip l;
    public aiip m;
    public aiip n;
    public int o;
    public int p;
    public int q;
    public aoms r;

    static {
        atpq atpqVar = new atpq();
        a = atpqVar;
        aihn.registerDefaultInstance(atpq.class, atpqVar);
    }

    private atpq() {
        aiip aiipVar = aiip.a;
        this.l = aiipVar;
        this.m = aiipVar;
        this.n = aiipVar;
        this.e = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aika aikaVar = aika.STRING;
            aika aikaVar2 = aika.INT32;
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0003\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007\tဇ\b\n2\u000b2\f2\rင\t\u000eင\n\u000fင\u000b\u0010ဉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "m", new ahud(aikaVar, (Object) "", aikaVar2, (Object) 0), "n", new ahud(aikaVar, "", aika.BOOL, Boolean.FALSE), "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new atpq();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpq.class);
        }
        return null;
    }
}
