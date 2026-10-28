package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aick extends aihn implements aiis {
    public static final aick a;
    public Object c;
    private int e;
    public int b = 0;
    public aigj d = aigj.d;

    static {
        aick aickVar = new aick();
        a = aickVar;
        aihn.registerDefaultInstance(aick.class, aickVar);
    }

    private aick() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ည\u0000\u0003=\u0000", new Object[]{"c", "b", "e", aicw.class, "d"});
        }
        if (iOrdinal == 3) {
            return new aick();
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
        return aihn.getParserForClass(aick.class);
    }
}
