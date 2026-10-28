package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arjt extends aihn implements aiis {
    public static final arjt a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        arjt arjtVar = new arjt();
        a = arjtVar;
        aihn.registerDefaultInstance(arjt.class, arjtVar);
    }

    private arjt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new arjt();
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
        return aihn.getParserForClass(arjt.class);
    }
}
