package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoph extends aihn implements aiis {
    public static final aoph a;
    public int b;
    public int c;
    public int d;

    static {
        aoph aophVar = new aoph();
        a = aophVar;
        aihn.registerDefaultInstance(aoph.class, aophVar);
    }

    private aoph() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", aqvi.c});
        }
        if (iOrdinal == 3) {
            return new aoph();
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
        return aihn.getParserForClass(aoph.class);
    }
}
