package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arbb extends aihn implements aiis {
    public static final arbb a;
    public String b = "";
    public String c = "";
    private int d;

    static {
        arbb arbbVar = new arbb();
        a = arbbVar;
        aihn.registerDefaultInstance(arbb.class, arbbVar);
    }

    private arbb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new arbb();
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
        return aihn.getParserForClass(arbb.class);
    }
}
