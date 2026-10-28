package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajod extends aihn implements aiis {
    public static final ajod a;
    public static final aihl b;

    static {
        ajod ajodVar = new ajod();
        a = ajodVar;
        aihn.registerDefaultInstance(ajod.class, ajodVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ajodVar, ajodVar, null, 74232380, aika.MESSAGE, ajod.class);
    }

    private ajod() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ajod();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ajod.class);
        }
        return null;
    }
}
