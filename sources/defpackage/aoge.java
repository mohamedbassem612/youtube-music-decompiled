package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoge extends aihn implements aiis {
    public static final aoge a;
    public static final aihl b;

    static {
        aoge aogeVar = new aoge();
        a = aogeVar;
        aihn.registerDefaultInstance(aoge.class, aogeVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aogeVar, aogeVar, null, 140507150, aika.MESSAGE, aoge.class);
    }

    private aoge() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aoge();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aoge.class);
        }
        return null;
    }
}
