package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alhm extends aihn implements aiis {
    public static final alhm a;
    public int b;
    private int c;

    static {
        alhm alhmVar = new alhm();
        a = alhmVar;
        aihn.registerDefaultInstance(alhm.class, alhmVar);
    }

    private alhm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", albk.t});
        }
        if (iOrdinal == 3) {
            return new alhm();
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
        return aihn.getParserForClass(alhm.class);
    }
}
