package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amcr extends aihn implements aiis {
    public static final amcr a;
    public int b;
    public int c;
    public amcs d;

    static {
        amcr amcrVar = new amcr();
        a = amcrVar;
        aihn.registerDefaultInstance(amcr.class, amcrVar);
    }

    private amcr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", alre.t, "d"});
        }
        if (iOrdinal == 3) {
            return new amcr();
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
        return aihn.getParserForClass(amcr.class);
    }
}
