package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anim extends aihn implements aiis {
    public static final anim a;
    public int b;
    public long c;
    public akvj d;
    public apbr e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    private int q;
    private int r;

    static {
        anim animVar = new anim();
        a = animVar;
        aihn.registerDefaultInstance(anim.class, animVar);
    }

    private anim() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0000\u0003\u0011^\u000e\u0000\u0000\u0000\u0011ဂ\u0011&ဉ\"1ဉ,3ဇ-4ဇ.7ဇ1Bဇ:Dဇ<Eင=Hဇ;Iဇ@SဇJ\\ငO^ဇR", new Object[]{"q", "b", "r", "c", "d", "e", "f", "g", "h", "i", "k", "l", "j", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new anim();
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
        return aihn.getParserForClass(anim.class);
    }
}
