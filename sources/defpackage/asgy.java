package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgy extends aihn implements aiis {
    public static final asgy a;
    public int b;
    public int d;
    public boolean e;
    public int g;
    public String c = "";
    public aihv f = emptyIntList();

    static {
        asgy asgyVar = new asgy();
        a = asgyVar;
        aihn.registerDefaultInstance(asgy.class, asgyVar);
    }

    private asgy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004'\u0005᠌\u0003", new Object[]{"b", "c", "d", "e", "f", "g", aiod.g});
        }
        if (iOrdinal == 3) {
            return new asgy();
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
        return aihn.getParserForClass(asgy.class);
    }
}
