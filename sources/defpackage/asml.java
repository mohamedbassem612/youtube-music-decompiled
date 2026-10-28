package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asml extends aihn implements aiis {
    public static final asml a;
    public int b;
    public float c;

    static {
        asml asmlVar = new asml();
        a = asmlVar;
        aihn.registerDefaultInstance(asml.class, asmlVar);
    }

    private asml() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new asml();
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
        return aihn.getParserForClass(asml.class);
    }
}
