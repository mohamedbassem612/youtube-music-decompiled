package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aljt extends aihn implements aiis {
    public static final aljt a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        aljt aljtVar = new aljt();
        a = aljtVar;
        aihn.registerDefaultInstance(aljt.class, aljtVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aljtVar, aljtVar, null, 22691, aika.MESSAGE, aljt.class);
    }

    private aljt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new aljt();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aljt.class);
    }
}
