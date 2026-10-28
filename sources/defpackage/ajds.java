package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ajds extends aihn implements aiis {
    public static final ajds a;
    public int b;
    private int c;

    static {
        ajds ajdsVar = new ajds();
        a = ajdsVar;
        aihn.registerDefaultInstance(ajds.class, ajdsVar);
    }

    private ajds() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aixp.n});
        }
        if (iOrdinal == 3) {
            return new ajds();
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
        return aihn.getParserForClass(ajds.class);
    }
}
