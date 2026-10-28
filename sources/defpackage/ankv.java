package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ankv extends aihn implements aiis {
    public static final ankv a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ankv ankvVar = new ankv();
        a = ankvVar;
        aihn.registerDefaultInstance(ankv.class, ankvVar);
    }

    private ankv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new ankv();
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
        return aihn.getParserForClass(ankv.class);
    }
}
