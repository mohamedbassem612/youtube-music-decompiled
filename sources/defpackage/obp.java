package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class obp extends aihn implements aiis {
    public static final obp a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        obp obpVar = new obp();
        a = obpVar;
        aihn.registerDefaultInstance(obp.class, obpVar);
    }

    private obp() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"d", "c", "b", gcz.class, gcy.class, "e", fxd.d});
        }
        if (iOrdinal == 3) {
            return new obp();
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
        return aihn.getParserForClass(obp.class);
    }
}
