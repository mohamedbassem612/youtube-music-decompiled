package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhe extends aihn implements aiis {
    public static final ajhe a;
    public boolean b;
    private int c;

    static {
        ajhe ajheVar = new ajhe();
        a = ajheVar;
        aihn.registerDefaultInstance(ajhe.class, ajheVar);
    }

    private ajhe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajhe();
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
        return aihn.getParserForClass(ajhe.class);
    }
}
