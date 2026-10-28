package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfm extends aihn implements aiis {
    public static final anfm a;
    public static final aihl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    private int g;

    static {
        anfm anfmVar = new anfm();
        a = anfmVar;
        aihn.registerDefaultInstance(anfm.class, anfmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anfmVar, anfmVar, null, 1446, aika.MESSAGE, anfm.class);
    }

    private anfm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"g", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new anfm();
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
        return aihn.getParserForClass(anfm.class);
    }
}
