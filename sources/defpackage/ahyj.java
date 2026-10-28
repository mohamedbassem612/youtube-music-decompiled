package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyj extends aihn implements aiis {
    public static final ahyj a;
    public int b;
    public int c = 0;
    public Object d;
    public ahyh e;

    static {
        ahyj ahyjVar = new ahyj();
        a = ahyjVar;
        aihn.registerDefaultInstance(ahyj.class, ahyjVar);
    }

    private ahyj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", ahzz.class, ahyz.class, ahzq.class, ahyn.class});
        }
        if (iOrdinal == 3) {
            return new ahyj();
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
        return aihn.getParserForClass(ahyj.class);
    }
}
