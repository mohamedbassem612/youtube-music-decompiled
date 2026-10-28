package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alji extends aihn implements aiis {
    public static final alji a;
    public int b;
    public int c;

    static {
        alji aljiVar = new alji();
        a = aljiVar;
        aihn.registerDefaultInstance(alji.class, aljiVar);
    }

    private alji() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", alip.h});
        }
        if (iOrdinal == 3) {
            return new alji();
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
        return aihn.getParserForClass(alji.class);
    }
}
