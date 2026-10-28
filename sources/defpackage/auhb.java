package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhb extends aihn implements aiis {
    public static final auhb a;
    public int b;
    public int d;
    public int e;
    public int f;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public aqkj o;
    public aqkf p;
    public float r;
    public String c = "";
    public String g = "";
    public int q = 3;

    static {
        auhb auhbVar = new auhb();
        a = auhbVar;
        aihn.registerDefaultInstance(auhb.class, auhbVar);
    }

    private auhb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006᠌\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fဇ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e\u0010ခ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", atxs.g, "i", "j", "k", "l", "m", "n", "o", "p", "q", aqgv.n, "r"});
        }
        if (iOrdinal == 3) {
            return new auhb();
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
        return aihn.getParserForClass(auhb.class);
    }
}
