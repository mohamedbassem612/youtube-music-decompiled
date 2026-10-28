package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auas extends aihn implements aiis {
    public static final auas a;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public boolean f;

    static {
        auas auasVar = new auas();
        a = auasVar;
        aihn.registerDefaultInstance(auas.class, auasVar);
    }

    private auas() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0001\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဇ\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000bဇ\u0001\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"d", "c", "b", auaz.class, auay.class, auaq.class, auac.class, "e", auaa.class, aubb.class, auba.class, auad.class, aubd.class, "f", auae.class, auao.class, auah.class, auaw.class, aubc.class});
        }
        if (iOrdinal == 3) {
            return new auas();
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
        return aihn.getParserForClass(auas.class);
    }
}
