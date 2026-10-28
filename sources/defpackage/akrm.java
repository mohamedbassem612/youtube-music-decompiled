package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrm extends aihn implements aiis {
    public static final akrm a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        akrm akrmVar = new akrm();
        a = akrmVar;
        aihn.registerDefaultInstance(akrm.class, akrmVar);
        b = aihn.newSingularGeneratedExtension(akro.a, akrmVar, akrmVar, null, 259430334, aika.MESSAGE, akrm.class);
    }

    private akrm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "c", ajpr.u});
        }
        if (iOrdinal == 3) {
            return new akrm();
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
        return aihn.getParserForClass(akrm.class);
    }
}
