package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amtm extends aihn implements aiis {
    public static final amtm a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        amtm amtmVar = new amtm();
        a = amtmVar;
        aihn.registerDefaultInstance(amtm.class, amtmVar);
    }

    private amtm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", amoe.l, "e"});
        }
        if (iOrdinal == 3) {
            return new amtm();
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
        return aihn.getParserForClass(amtm.class);
    }
}
