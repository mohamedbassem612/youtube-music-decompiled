package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyf extends aihn implements aiis {
    public static final apyf a;
    public static final aihl b;
    public boolean c;
    private int d;

    static {
        apyf apyfVar = new apyf();
        a = apyfVar;
        aihn.registerDefaultInstance(apyf.class, apyfVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apyfVar, apyfVar, null, 365619327, aika.MESSAGE, apyf.class);
    }

    private apyf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new apyf();
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
        return aihn.getParserForClass(apyf.class);
    }
}
