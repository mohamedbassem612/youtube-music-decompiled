package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axho extends aihn implements aiis {
    public static final axho a;
    public int b;
    public int c;
    public int d;
    public aihv e = emptyIntList();
    public aihv f = emptyIntList();

    static {
        axho axhoVar = new axho();
        a = axhoVar;
        aihn.registerDefaultInstance(axho.class, axhoVar);
    }

    private axho() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new axho();
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
        return aihn.getParserForClass(axho.class);
    }
}
