package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akzu extends aihn implements aiis {
    public static final akzu a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        akzu akzuVar = new akzu();
        a = akzuVar;
        aihn.registerDefaultInstance(akzu.class, akzuVar);
    }

    private akzu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", akvb.l, "d", akvb.m, "e"});
        }
        if (iOrdinal == 3) {
            return new akzu();
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
        return aihn.getParserForClass(akzu.class);
    }
}
