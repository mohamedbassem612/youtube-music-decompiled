package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aina extends aihn implements aiis {
    public static final aina a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        aina ainaVar = new aina();
        a = ainaVar;
        aihn.registerDefaultInstance(aina.class, ainaVar);
        b = aihn.newSingularGeneratedExtension(aiov.a, ainaVar, ainaVar, null, 2147476035, aika.MESSAGE, aina.class);
    }

    private aina() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aina();
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
        return aihn.getParserForClass(aina.class);
    }
}
