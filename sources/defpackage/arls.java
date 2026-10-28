package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arls extends aihn implements aiis {
    public static final arls a;
    public aigj b = aigj.d;
    private int c;

    static {
        arls arlsVar = new arls();
        a = arlsVar;
        aihn.registerDefaultInstance(arls.class, arlsVar);
    }

    private arls() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new arls();
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
        return aihn.getParserForClass(arls.class);
    }
}
