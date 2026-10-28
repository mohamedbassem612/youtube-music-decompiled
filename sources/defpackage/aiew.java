package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiew extends aihn implements aiis {
    public static final aiew a;
    public int b;
    public aiev c;
    public boolean d;
    public boolean e;
    public boolean f;
    public aihv g = emptyIntList();
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        aiew aiewVar = new aiew();
        a = aiewVar;
        aihn.registerDefaultInstance(aiew.class, aiewVar);
    }

    private aiew() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\u0016\n\u0000\u0001\u0000\u0001ဉ\u0000\u0007ဇ\u0006\bဇ\u0007\tဇ\b\u000bࠬ\rဇ\u000b\u0010ဇ\u000e\u0013ဇ\u0011\u0015ဇ\u0013\u0016ဇ\u0014", new Object[]{"b", "c", "d", "e", "f", "g", aibu.c, "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new aiew();
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
        return aihn.getParserForClass(aiew.class);
    }
}
