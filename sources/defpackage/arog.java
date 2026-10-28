package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arog extends aihn implements aiis {
    public static final arog a;
    public int b;
    public aigj c = aigj.d;
    public int d;

    static {
        arog arogVar = new arog();
        a = arogVar;
        aihn.registerDefaultInstance(arog.class, arogVar);
    }

    private arog() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", arke.k});
        }
        if (iOrdinal == 3) {
            return new arog();
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
        return aihn.getParserForClass(arog.class);
    }
}
