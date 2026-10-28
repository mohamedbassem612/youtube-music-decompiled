package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqiy extends aihn implements aiis {
    public static final aqiy a;
    public boolean b;
    public boolean c;
    public float d = 1.0f;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    private int r;

    static {
        aqiy aqiyVar = new aqiy();
        a = aqiyVar;
        aihn.registerDefaultInstance(aqiy.class, aqiyVar);
    }

    private aqiy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0016\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0005\u0003ဇ\u0006\u0004င\u0007\u0005ဇ\u0001\u0006ဇ\u0003\u0007ခ\u0002\bဇ\b\u000bဇ\f\fဇ\u000f\rဇ\u0010\u0010ဇ\u000b\u0011ဇ\u0012\u0012င\u0013\u0013ဇ\r\u0016ဇ\u0014", new Object[]{"r", "b", "f", "g", "h", "c", "e", "d", "i", "k", "m", "n", "j", "o", "p", "l", "q"});
        }
        if (iOrdinal == 3) {
            return new aqiy();
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
        return aihn.getParserForClass(aqiy.class);
    }
}
