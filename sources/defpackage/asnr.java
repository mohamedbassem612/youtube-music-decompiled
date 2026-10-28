package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asnr extends aihn implements aiis {
    public static final asnr a;
    public double b;
    public double c;
    public double d = 1.0d;
    public double e = 1.0d;
    private int f;

    static {
        asnr asnrVar = new asnr();
        a = asnrVar;
        aihn.registerDefaultInstance(asnr.class, asnrVar);
    }

    private asnr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asnr();
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
        return aihn.getParserForClass(asnr.class);
    }
}
