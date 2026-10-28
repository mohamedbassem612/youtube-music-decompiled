package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajpt extends aihn implements aiis {
    public static final ajpt a;
    public static final aihl b;
    public aigj c = aigj.d;
    public int d;
    private int e;

    static {
        ajpt ajptVar = new ajpt();
        a = ajptVar;
        aihn.registerDefaultInstance(ajpt.class, ajptVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajptVar, ajptVar, null, 77125633, aika.MESSAGE, ajpt.class);
    }

    private ajpt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0000\u0003᠌\u0001", new Object[]{"e", "c", "d", ajhk.k});
        }
        if (iOrdinal == 3) {
            return new ajpt();
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
        return aihn.getParserForClass(ajpt.class);
    }
}
