package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asiv extends aihn implements aiis {
    public static final asiv a;
    public int b;
    public int c;
    private int d;

    static {
        asiv asivVar = new asiv();
        a = asivVar;
        aihn.registerDefaultInstance(asiv.class, asivVar);
    }

    private asiv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new asiv();
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
        return aihn.getParserForClass(asiv.class);
    }
}
