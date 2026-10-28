package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkc extends aihn implements aiis {
    public static final alkc a;
    public boolean b;
    private int c;

    static {
        alkc alkcVar = new alkc();
        a = alkcVar;
        aihn.registerDefaultInstance(alkc.class, alkcVar);
    }

    private alkc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new alkc();
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
        return aihn.getParserForClass(alkc.class);
    }
}
