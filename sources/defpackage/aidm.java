package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidm extends aihn implements aiis {
    public static final aidm a;
    public String b = "";
    public String c = "";
    public aieg d;
    private int e;

    static {
        aidm aidmVar = new aidm();
        a = aidmVar;
        aihn.registerDefaultInstance(aidm.class, aidmVar);
    }

    private aidm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aidm();
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
        return aihn.getParserForClass(aidm.class);
    }
}
