package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arcr extends aihn implements aiis {
    public static final arcr a;
    public int b;
    public int c;
    public float d = 1.0f;
    public apdd e;
    public arby f;
    public arby g;
    public double h;
    public arby i;
    public arcq j;

    static {
        arcr arcrVar = new arcr();
        a = arcrVar;
        aihn.registerDefaultInstance(arcr.class, arcrVar);
    }

    private arcr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007က\u0005\bဉ\u0006\tဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new arcr();
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
        return aihn.getParserForClass(arcr.class);
    }
}
