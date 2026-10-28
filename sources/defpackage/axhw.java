package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axhw extends aihn implements aiis {
    public static final axhw a;
    public aihv b = emptyIntList();
    public aihv c = emptyIntList();

    static {
        axhw axhwVar = new axhw();
        a = axhwVar;
        aihn.registerDefaultInstance(axhw.class, axhwVar);
    }

    private axhw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new axhw();
        }
        if (iOrdinal == 4) {
            return new jrr((short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(axhw.class);
        }
        return null;
    }
}
