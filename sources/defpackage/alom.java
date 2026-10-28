package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alom extends aihn implements aiis {
    public static final alom a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        alom alomVar = new alom();
        a = alomVar;
        aihn.registerDefaultInstance(alom.class, alomVar);
    }

    private alom() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0004\u0005ဈ\u0005", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new alom();
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
        return aihn.getParserForClass(alom.class);
    }
}
