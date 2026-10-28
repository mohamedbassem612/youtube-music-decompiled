package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arbf extends aihn implements aiis {
    public static final arbf a;
    public int b;
    public Object d;
    public int f;
    public int g;
    public int c = 0;
    public String e = "";

    static {
        arbf arbfVar = new arbf();
        a = arbfVar;
        aihn.registerDefaultInstance(arbf.class, arbfVar);
    }

    private arbf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003<\u0000\u0004᠌\u0002", new Object[]{"d", "c", "b", "e", "f", aram.e, arbe.class, "g", aram.f});
        }
        if (iOrdinal == 3) {
            return new arbf();
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
        return aihn.getParserForClass(arbf.class);
    }
}
