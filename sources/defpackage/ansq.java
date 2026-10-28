package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ansq extends aihn implements aiis {
    public static final ansq a;
    public int b = 0;
    private Object c;

    static {
        ansq ansqVar = new ansq();
        a = ansqVar;
        aihn.registerDefaultInstance(ansq.class, ansqVar);
    }

    private ansq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", ansp.class});
        }
        if (iOrdinal == 3) {
            return new ansq();
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
        return aihn.getParserForClass(ansq.class);
    }
}
