package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajeg extends aihn implements aiis {
    public static final ajeg a;
    public aifv b;
    private int c;

    static {
        ajeg ajegVar = new ajeg();
        a = ajegVar;
        aihn.registerDefaultInstance(ajeg.class, ajegVar);
    }

    private ajeg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajeg();
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
        return aihn.getParserForClass(ajeg.class);
    }
}
