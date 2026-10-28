package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojq extends aihn implements aiis {
    public static final aojq a;
    public boolean b;
    public aigj c = aigj.d;
    private int d;

    static {
        aojq aojqVar = new aojq();
        a = aojqVar;
        aihn.registerDefaultInstance(aojq.class, aojqVar);
    }

    private aojq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0004ည\u0003", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new aojq();
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
        return aihn.getParserForClass(aojq.class);
    }
}
