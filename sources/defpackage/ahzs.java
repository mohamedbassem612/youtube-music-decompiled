package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahzs extends aihn implements aiis {
    public static final ahzs a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ahzs ahzsVar = new ahzs();
        a = ahzsVar;
        aihn.registerDefaultInstance(ahzs.class, ahzsVar);
    }

    private ahzs() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"d", "c", "b", ahzr.class, ahxv.d, "e"});
        }
        if (iOrdinal == 3) {
            return new ahzs();
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
        return aihn.getParserForClass(ahzs.class);
    }
}
