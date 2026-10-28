package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aueq extends aihn implements aiis {
    public static final aueq a;
    public int b = 0;
    public Object c;

    static {
        aueq aueqVar = new aueq();
        a = aueqVar;
        aihn.registerDefaultInstance(aueq.class, aueqVar);
    }

    private aueq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", auds.class});
        }
        if (iOrdinal == 3) {
            return new aueq();
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
        return aihn.getParserForClass(aueq.class);
    }
}
