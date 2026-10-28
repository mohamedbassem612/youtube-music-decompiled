package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aosr extends aihn implements aiis {
    public static final aihw a = new aiat(19);
    public static final aosr b;
    public aihv c = emptyIntList();

    static {
        aosr aosrVar = new aosr();
        b = aosrVar;
        aihn.registerDefaultInstance(aosr.class, aosrVar);
    }

    private aosr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", aomi.t});
        }
        if (iOrdinal == 3) {
            return new aosr();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aosr.class);
    }
}
