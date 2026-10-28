package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxx extends aihn implements aiis {
    public static final afxx a;
    public aigj b;

    static {
        afxx afxxVar = new afxx();
        a = afxxVar;
        aihn.registerDefaultInstance(afxx.class, afxxVar);
    }

    private afxx() {
        aigj aigjVar = aigj.d;
        this.b = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u000f\u000f\u0001\u0000\u0000\u0000\u000f\n", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new afxx();
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
        return aihn.getParserForClass(afxx.class);
    }
}
