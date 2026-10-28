package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aroc extends aihn implements aiis {
    public static final aroc a;
    public int b;
    public aigj c = aigj.d;
    public int d;

    static {
        aroc arocVar = new aroc();
        a = arocVar;
        aihn.registerDefaultInstance(aroc.class, arocVar);
    }

    private aroc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", arke.k});
        }
        if (iOrdinal == 3) {
            return new aroc();
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
        return aihn.getParserForClass(aroc.class);
    }
}
