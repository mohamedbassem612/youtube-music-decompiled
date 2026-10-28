package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoni extends aihn implements aiis {
    public static final aoni a;
    public int b;
    public int c;
    public aihv d = emptyIntList();
    public int e;
    public boolean f;

    static {
        aoni aoniVar = new aoni();
        a = aoniVar;
        aihn.registerDefaultInstance(aoni.class, aoniVar);
    }

    private aoni() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u0016\u0003င\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aoni();
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
        return aihn.getParserForClass(aoni.class);
    }
}
