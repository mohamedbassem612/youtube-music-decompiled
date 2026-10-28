package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aowa extends aihn implements aiis {
    public static final aowa a;
    public static final aihl b;

    static {
        aowa aowaVar = new aowa();
        a = aowaVar;
        aihn.registerDefaultInstance(aowa.class, aowaVar);
        b = aihn.newSingularGeneratedExtension(aowc.a, "", null, null, 125983101, aika.STRING, String.class);
    }

    private aowa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aowa();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aowa.class);
        }
        return null;
    }
}
