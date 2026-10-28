package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amcf extends aihn implements aiis {
    public static final amcf a;
    public int b;
    public int c;
    public amcs d;

    static {
        amcf amcfVar = new amcf();
        a = amcfVar;
        aihn.registerDefaultInstance(amcf.class, amcfVar);
    }

    private amcf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", alre.t, "d"});
        }
        if (iOrdinal == 3) {
            return new amcf();
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
        return aihn.getParserForClass(amcf.class);
    }
}
