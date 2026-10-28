package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammm extends aihn implements aiis {
    public static final ammm a;
    public int b;
    private int c;

    static {
        ammm ammmVar = new ammm();
        a = ammmVar;
        aihn.registerDefaultInstance(ammm.class, ammmVar);
    }

    private ammm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ammm();
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
        return aihn.getParserForClass(ammm.class);
    }
}
