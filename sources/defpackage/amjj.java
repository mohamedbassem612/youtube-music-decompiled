package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amjj extends aihn implements aiis {
    public static final amjj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    static {
        amjj amjjVar = new amjj();
        a = amjjVar;
        aihn.registerDefaultInstance(amjj.class, amjjVar);
    }

    private amjj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဇ\u0005\bဇ\u0007\tဇ\b\nဇ\t", new Object[]{"b", "c", amjn.p, "d", "e", "f", amjn.q, "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new amjj();
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
        return aihn.getParserForClass(amjj.class);
    }
}
