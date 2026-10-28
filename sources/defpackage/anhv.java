package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anhv extends aihn implements aiis {
    public static final anhv a;
    private int b;
    private anhp c;

    static {
        anhv anhvVar = new anhv();
        a = anhvVar;
        aihn.registerDefaultInstance(anhv.class, anhvVar);
    }

    private anhv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0005", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new anhv();
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
        return aihn.getParserForClass(anhv.class);
    }
}
