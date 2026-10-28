package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aict extends aihn implements aiis {
    public static final aict a;
    public int b = 0;
    public Object c;
    public int d;
    private int e;

    static {
        aict aictVar = new aict();
        a = aictVar;
        aihn.registerDefaultInstance(aict.class, aictVar);
    }

    private aict() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "e", "d", aijp.class, aijp.class, aigu.class, aigu.class});
        }
        if (iOrdinal == 3) {
            return new aict();
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
        return aihn.getParserForClass(aict.class);
    }
}
