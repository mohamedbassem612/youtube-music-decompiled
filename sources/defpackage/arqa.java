package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arqa extends aihn implements aiis {
    public static final arqa a;
    public static final aihl b;
    public String c = "";
    public aigj d = aigj.d;
    private int e;

    static {
        arqa arqaVar = new arqa();
        a = arqaVar;
        aihn.registerDefaultInstance(arqa.class, arqaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arqaVar, arqaVar, null, 191943580, aika.MESSAGE, arqa.class);
    }

    private arqa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new arqa();
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
        return aihn.getParserForClass(arqa.class);
    }
}
