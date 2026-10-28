package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucm extends aihn implements aiis {
    public static final aucm a;
    public int b;
    public auby c;
    public boolean d;
    public auck e;

    static {
        aucm aucmVar = new aucm();
        a = aucmVar;
        aihn.registerDefaultInstance(aucm.class, aucmVar);
    }

    private aucm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aucm();
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
        return aihn.getParserForClass(aucm.class);
    }
}
