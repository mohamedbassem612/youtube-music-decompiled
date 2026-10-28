package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiac extends aihn implements aiis {
    public static final aiac a;
    public int b;
    public int c;
    public int e;
    public int g;
    public String d = "";
    public String f = "";

    static {
        aiac aiacVar = new aiac();
        a = aiacVar;
        aihn.registerDefaultInstance(aiac.class, aiacVar);
    }

    private aiac() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"b", "c", ahzf.l, "d", "e", ahzf.n, "f", "g", ahzf.m});
        }
        if (iOrdinal == 3) {
            return new aiac();
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
        return aihn.getParserForClass(aiac.class);
    }
}
