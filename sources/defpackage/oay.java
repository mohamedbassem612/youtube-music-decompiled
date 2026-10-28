package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oay extends aihn implements aiis {
    public static final oay a;
    public boolean b;
    public long d;
    public boolean e;
    private int h;
    public long c = 3600000;
    public long f = 5;
    public long g = 60000;

    static {
        oay oayVar = new oay();
        a = oayVar;
        aihn.registerDefaultInstance(oay.class, oayVar);
    }

    private oay() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0003\n\u0006\u0000\u0000\u0000\u0003ဇ\u0002\u0005ဂ\u0004\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"h", "b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new oay();
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
        return aihn.getParserForClass(oay.class);
    }
}
