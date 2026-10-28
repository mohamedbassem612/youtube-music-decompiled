package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwd extends aihn implements aiis {
    public static final ahwd a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ahwd ahwdVar = new ahwd();
        a = ahwdVar;
        aihn.registerDefaultInstance(ahwd.class, ahwdVar);
    }

    private ahwd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahwd();
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
        return aihn.getParserForClass(ahwd.class);
    }
}
