package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjf extends aihn implements aiis {
    public static final amjf a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        amjf amjfVar = new amjf();
        a = amjfVar;
        aihn.registerDefaultInstance(amjf.class, amjfVar);
    }

    private amjf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\b᠌\u0007\u000bဇ\n\f᠌\u000b\u000eဇ\r", new Object[]{"b", "c", amjn.l, "d", amjn.k, "e", amjn.j, "f", apdr.h, "g", apdr.f, "h", apdr.e, "i", "j", amjn.n, "k", "l", apdr.i, "m"});
        }
        if (iOrdinal == 3) {
            return new amjf();
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
        return aihn.getParserForClass(amjf.class);
    }
}
