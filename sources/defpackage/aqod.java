package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqod extends aihn implements aiis {
    public static final aqod a;
    public int b;
    private int c;

    static {
        aqod aqodVar = new aqod();
        a = aqodVar;
        aihn.registerDefaultInstance(aqod.class, aqodVar);
    }

    private aqod() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aqkp.l});
        }
        if (iOrdinal == 3) {
            return new aqod();
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
        return aihn.getParserForClass(aqod.class);
    }
}
