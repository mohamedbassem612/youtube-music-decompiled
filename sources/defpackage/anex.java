package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anex extends aihn implements aiis {
    public static final anex a;
    public static final aihl b;

    static {
        anex anexVar = new anex();
        a = anexVar;
        aihn.registerDefaultInstance(anex.class, anexVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, anexVar, anexVar, null, 1681, aika.MESSAGE, anex.class);
    }

    private anex() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new anex();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(anex.class);
        }
        return null;
    }
}
