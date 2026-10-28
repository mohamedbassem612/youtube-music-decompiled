package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivq extends aihn implements aiis {
    public static final aivq a;
    public int b;
    private int c;

    static {
        aivq aivqVar = new aivq();
        a = aivqVar;
        aihn.registerDefaultInstance(aivq.class, aivqVar);
    }

    private aivq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aivq();
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
        return aihn.getParserForClass(aivq.class);
    }
}
