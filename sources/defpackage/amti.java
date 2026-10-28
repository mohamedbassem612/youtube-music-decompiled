package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amti extends aihn implements aiis {
    public static final amti a;

    static {
        amti amtiVar = new amti();
        a = amtiVar;
        aihn.registerDefaultInstance(amti.class, amtiVar);
    }

    private amti() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new amti();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amti.class);
        }
        return null;
    }
}
