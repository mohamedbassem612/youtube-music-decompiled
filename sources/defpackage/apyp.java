package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apyp extends aihn implements aiis {
    public static final apyp a;
    public static final aihl b;

    static {
        apyp apypVar = new apyp();
        a = apypVar;
        aihn.registerDefaultInstance(apyp.class, apypVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apypVar, apypVar, null, 231698257, aika.MESSAGE, apyp.class);
    }

    private apyp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apyp();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apyp.class);
        }
        return null;
    }
}
