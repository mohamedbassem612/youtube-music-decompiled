package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajfr extends aihn implements aiis {
    public static final ajfr a;
    public int b;
    private int c;

    static {
        ajfr ajfrVar = new ajfr();
        a = ajfrVar;
        aihn.registerDefaultInstance(ajfr.class, ajfrVar);
    }

    private ajfr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", albk.e});
        }
        if (iOrdinal == 3) {
            return new ajfr();
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
        return aihn.getParserForClass(ajfr.class);
    }
}
