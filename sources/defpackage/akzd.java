package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akzd extends aihn implements aiis {
    public static final akzd a;
    public static final aihl b;

    static {
        akzd akzdVar = new akzd();
        a = akzdVar;
        aihn.registerDefaultInstance(akzd.class, akzdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akzdVar, akzdVar, null, 74232392, aika.MESSAGE, akzd.class);
    }

    private akzd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new akzd();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(akzd.class);
        }
        return null;
    }
}
