package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ascu extends aihn implements aiis {
    public static final ascu a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        ascu ascuVar = new ascu();
        a = ascuVar;
        aihn.registerDefaultInstance(ascu.class, ascuVar);
    }

    private ascu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0004ဇ\u0003", new Object[]{"b", "c", "d", alre.p, "e"});
        }
        if (iOrdinal == 3) {
            return new ascu();
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
        return aihn.getParserForClass(ascu.class);
    }
}
