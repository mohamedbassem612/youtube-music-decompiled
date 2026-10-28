package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akpe extends aihn implements aiis {
    public static final akpe a;
    public static final aihl b;

    static {
        akpe akpeVar = new akpe();
        a = akpeVar;
        aihn.registerDefaultInstance(akpe.class, akpeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akpeVar, akpeVar, null, 311688876, aika.MESSAGE, akpe.class);
    }

    private akpe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new akpe();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(akpe.class);
        }
        return null;
    }
}
