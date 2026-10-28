package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiyw extends aihn implements aiis {
    public static final aiyw a;
    public aihv b = emptyIntList();

    static {
        aiyw aiywVar = new aiyw();
        a = aiywVar;
        aihn.registerDefaultInstance(aiyw.class, aiywVar);
    }

    private aiyw() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"b", aixh.a});
        }
        if (iOrdinal == 3) {
            return new aiyw();
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
        return aihn.getParserForClass(aiyw.class);
    }
}
