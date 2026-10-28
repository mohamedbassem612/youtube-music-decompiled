package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxx extends aihn implements aiis {
    public static final amxx a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        amxx amxxVar = new amxx();
        a = amxxVar;
        aihn.registerDefaultInstance(amxx.class, amxxVar);
    }

    private amxx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", apep.s, "e", apep.t, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new amxx();
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
        return aihn.getParserForClass(amxx.class);
    }
}
