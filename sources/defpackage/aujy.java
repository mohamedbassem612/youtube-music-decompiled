package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujy extends aihn implements aiis {
    public static final aujy a;

    static {
        aujy aujyVar = new aujy();
        a = aujyVar;
        aihn.registerDefaultInstance(aujy.class, aujyVar);
    }

    private aujy() {
        emptyFloatList();
        emptyFloatList();
        emptyFloatList();
        emptyFloatList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aujy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aujy.class);
        }
        return null;
    }
}
