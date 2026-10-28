package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfj extends aihn implements aiis {
    public static final amfj a;
    public int b;
    public amfl c;
    public int d;
    public String e = "";
    public aigj f = aigj.d;

    static {
        amfj amfjVar = new amfj();
        a = amfjVar;
        aihn.registerDefaultInstance(amfj.class, amfjVar);
    }

    private amfj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ည\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amfj();
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
        return aihn.getParserForClass(amfj.class);
    }
}
