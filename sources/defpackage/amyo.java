package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amyo extends aihn implements aiis {
    public static final amyo a;
    public int b;
    public String c = "";
    private int d;

    static {
        amyo amyoVar = new amyo();
        a = amyoVar;
        aihn.registerDefaultInstance(amyo.class, amyoVar);
    }

    private amyo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"d", "b", amoe.q, "c"});
        }
        if (iOrdinal == 3) {
            return new amyo();
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
        return aihn.getParserForClass(amyo.class);
    }
}
