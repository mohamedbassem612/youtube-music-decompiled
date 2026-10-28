package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxy extends aihn implements aiis {
    public static final apxy a;
    public static final aihl b;

    static {
        apxy apxyVar = new apxy();
        a = apxyVar;
        aihn.registerDefaultInstance(apxy.class, apxyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxyVar, apxyVar, null, 1991, aika.MESSAGE, apxy.class);
    }

    private apxy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new apxy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(apxy.class);
        }
        return null;
    }
}
