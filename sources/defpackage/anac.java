package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anac extends aihn implements aiis {
    public static final anac a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public boolean g;

    static {
        anac anacVar = new anac();
        a = anacVar;
        aihn.registerDefaultInstance(anac.class, anacVar);
    }

    private anac() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0004\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"b", "c", "d", "g", "e", amys.q, "f", amys.u});
        }
        if (iOrdinal == 3) {
            return new anac();
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
        return aihn.getParserForClass(anac.class);
    }
}
