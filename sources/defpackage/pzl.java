package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pzl extends aihn implements aiis {
    public static final pzl a;
    public int b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public int g;
    public int h;
    public float i;
    public int j;
    public int k;
    public int l;
    private int m;

    static {
        pzl pzlVar = new pzl();
        a = pzlVar;
        aihn.registerDefaultInstance(pzl.class, pzlVar);
    }

    private pzl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0003ခ\u0003\u0004ခ\u0007\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\b\tင\t\nင\n\u000bဇ\u0001\fဇ\u0002", new Object[]{"m", "b", fxi.k, "e", "i", "f", "g", "h", "j", "k", "l", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new pzl();
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
        return aihn.getParserForClass(pzl.class);
    }
}
