package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alyq extends aihn implements aiis {
    public static final alyq a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    private int f;

    static {
        alyq alyqVar = new alyq();
        a = alyqVar;
        aihn.registerDefaultInstance(alyq.class, alyqVar);
    }

    private alyq() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဋ\u0002\u0004ဇ\u0003\u0006᠌\u0005", new Object[]{"f", "b", "c", "d", "e", allf.h});
        }
        if (iOrdinal == 3) {
            return new alyq();
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
        return aihn.getParserForClass(alyq.class);
    }
}
