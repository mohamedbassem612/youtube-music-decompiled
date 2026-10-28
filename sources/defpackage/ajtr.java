package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajtr extends aihn implements aiis {
    public static final ajtr a;
    public int b;
    private int c;

    static {
        ajtr ajtrVar = new ajtr();
        a = ajtrVar;
        aihn.registerDefaultInstance(ajtr.class, ajtrVar);
    }

    private ajtr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", ajpr.k});
        }
        if (iOrdinal == 3) {
            return new ajtr();
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
        return aihn.getParserForClass(ajtr.class);
    }
}
