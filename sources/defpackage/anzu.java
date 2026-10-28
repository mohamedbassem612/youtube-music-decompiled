package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzu extends aihn implements aiis {
    public static final anzu a;
    public int b;
    private int c;

    static {
        anzu anzuVar = new anzu();
        a = anzuVar;
        aihn.registerDefaultInstance(anzu.class, anzuVar);
    }

    private anzu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aobf.b});
        }
        if (iOrdinal == 3) {
            return new anzu();
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
        return aihn.getParserForClass(anzu.class);
    }
}
