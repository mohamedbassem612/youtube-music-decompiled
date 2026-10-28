package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oiz extends aihn implements aiis {
    public static final oiz a;
    public int b;
    public long d;
    public int f;
    public atyn g;
    public String c = "";
    public String e = "";

    static {
        oiz oizVar = new oiz();
        a = oizVar;
        aihn.registerDefaultInstance(oiz.class, oizVar);
    }

    private oiz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", oia.g, "g"});
        }
        if (iOrdinal == 3) {
            return new oiz();
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
        return aihn.getParserForClass(oiz.class);
    }
}
