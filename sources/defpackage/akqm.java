package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akqm extends aihn implements aiis {
    public static final akqm a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        akqm akqmVar = new akqm();
        a = akqmVar;
        aihn.registerDefaultInstance(akqm.class, akqmVar);
    }

    private akqm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new akqm();
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
        return aihn.getParserForClass(akqm.class);
    }
}
