package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiqr extends aihn implements aiis {
    public static final aiqr a;
    public static final aihl b;

    static {
        aiqr aiqrVar = new aiqr();
        a = aiqrVar;
        aihn.registerDefaultInstance(aiqr.class, aiqrVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiqrVar, aiqrVar, null, 88845952, aika.MESSAGE, aiqr.class);
    }

    private aiqr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aiqr();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aiqr.class);
        }
        return null;
    }
}
