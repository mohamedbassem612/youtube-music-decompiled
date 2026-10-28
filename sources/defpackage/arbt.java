package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arbt extends aihn implements aiis {
    public static final arbt a;
    public int b;
    public long f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        arbt arbtVar = new arbt();
        a = arbtVar;
        aihn.registerDefaultInstance(arbt.class, arbtVar);
    }

    private arbt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0003\u0004ဈ\u0004\u0005ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "e"});
        }
        if (iOrdinal == 3) {
            return new arbt();
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
        return aihn.getParserForClass(arbt.class);
    }
}
