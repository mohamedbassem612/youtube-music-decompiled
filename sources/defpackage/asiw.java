package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asiw extends aihn implements aiis {
    public static final asiw a;
    public asiv b;
    public aigj c = aigj.d;
    private int d;

    static {
        asiw asiwVar = new asiw();
        a = asiwVar;
        aihn.registerDefaultInstance(asiw.class, asiwVar);
    }

    private asiw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new asiw();
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
        return aihn.getParserForClass(asiw.class);
    }
}
