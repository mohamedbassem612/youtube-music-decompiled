package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahzn extends aihn implements aiis {
    public static final ahzn a;
    public int b;
    public Object d;
    public ahzm f;
    public int c = 0;
    public String e = "";

    static {
        ahzn ahznVar = new ahzn();
        a = ahznVar;
        aihn.registerDefaultInstance(ahzn.class, ahznVar);
    }

    private ahzn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u0003ဉ\u0001\u0004;\u0000", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ahzn();
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
        return aihn.getParserForClass(ahzn.class);
    }
}
