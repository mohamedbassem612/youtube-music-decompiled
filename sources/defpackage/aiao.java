package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiao extends aihn implements aiis {
    public static final aiao a;
    public int b;
    public long e;
    public long g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        aiao aiaoVar = new aiao();
        a = aiaoVar;
        aihn.registerDefaultInstance(aiao.class, aiaoVar);
    }

    private aiao() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဈ\u0001", new Object[]{"b", "c", "f", "e", "g", "d"});
        }
        if (iOrdinal == 3) {
            return new aiao();
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
        return aihn.getParserForClass(aiao.class);
    }
}
