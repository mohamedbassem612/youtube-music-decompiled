package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apoe extends aihn implements aiis {
    public static final apoe a;
    public int b;
    private int c;

    static {
        apoe apoeVar = new apoe();
        a = apoeVar;
        aihn.registerDefaultInstance(apoe.class, apoeVar);
    }

    private apoe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", apjs.n});
        }
        if (iOrdinal == 3) {
            return new apoe();
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
        return aihn.getParserForClass(apoe.class);
    }
}
