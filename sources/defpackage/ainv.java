package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ainv extends aihn implements aiis {
    public static final ainv a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public long f;

    static {
        ainv ainvVar = new ainv();
        a = ainvVar;
        aihn.registerDefaultInstance(ainv.class, ainvVar);
    }

    private ainv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", aidl.s, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ainv();
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
        return aihn.getParserForClass(ainv.class);
    }
}
