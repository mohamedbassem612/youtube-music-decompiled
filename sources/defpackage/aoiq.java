package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoiq extends aihn implements aiis {
    public static final aihw a = new aiat(17);
    public static final aoiq b;
    public aihv c = emptyIntList();

    static {
        aoiq aoiqVar = new aoiq();
        b = aoiqVar;
        aihn.registerDefaultInstance(aoiq.class, aoiqVar);
    }

    private aoiq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", aixp.b});
        }
        if (iOrdinal == 3) {
            return new aoiq();
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
        return aihn.getParserForClass(aoiq.class);
    }
}
