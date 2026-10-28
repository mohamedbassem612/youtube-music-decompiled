package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqrd extends aihn implements aiis {
    public static final aqrd a;

    static {
        aqrd aqrdVar = new aqrd();
        a = aqrdVar;
        aihn.registerDefaultInstance(aqrd.class, aqrdVar);
    }

    private aqrd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aqrd();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aqrd.class);
        }
        return null;
    }
}
