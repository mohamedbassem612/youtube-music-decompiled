package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alfa extends aihn implements aiis {
    public static final alfa a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        alfa alfaVar = new alfa();
        a = alfaVar;
        aihn.registerDefaultInstance(alfa.class, alfaVar);
    }

    private alfa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new alfa();
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
        return aihn.getParserForClass(alfa.class);
    }
}
