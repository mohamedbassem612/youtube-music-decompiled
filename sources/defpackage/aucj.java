package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucj extends aihn implements aiis {
    public static final aucj a;
    public int b;
    public auby c;
    public int d;

    static {
        aucj aucjVar = new aucj();
        a = aucjVar;
        aihn.registerDefaultInstance(aucj.class, aucjVar);
    }

    private aucj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aucj();
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
        return aihn.getParserForClass(aucj.class);
    }
}
