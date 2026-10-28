package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqyu extends aihn implements aiis {
    public static final aqyu a;
    public Object c;
    private int e;
    public int b = 0;
    public aigj d = aigj.d;

    static {
        aqyu aqyuVar = new aqyu();
        a = aqyuVar;
        aihn.registerDefaultInstance(aqyu.class, aqyuVar);
    }

    private aqyu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002;\u0000\u0003;\u0000\u0004ည\u0000", new Object[]{"c", "b", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new aqyu();
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
        return aihn.getParserForClass(aqyu.class);
    }
}
