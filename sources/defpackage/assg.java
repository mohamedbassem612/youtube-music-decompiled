package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class assg extends aihn implements aiis {
    public static final assg a;
    public int b;
    public assc c;
    public String d = "";

    static {
        assg assgVar = new assg();
        a = assgVar;
        aihn.registerDefaultInstance(assg.class, assgVar);
    }

    private assg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new assg();
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
        return aihn.getParserForClass(assg.class);
    }
}
