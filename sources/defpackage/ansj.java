package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ansj extends aihn implements aiis {
    public static final ansj a;
    public static final aihl b;

    static {
        ansj ansjVar = new ansj();
        a = ansjVar;
        aihn.registerDefaultInstance(ansj.class, ansjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ansjVar, ansjVar, null, 475363057, aika.MESSAGE, ansj.class);
    }

    private ansj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ansj();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(ansj.class);
        }
        return null;
    }
}
