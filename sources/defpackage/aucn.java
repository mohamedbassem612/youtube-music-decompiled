package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucn extends aihn implements aiis {
    public static final aucn a;
    public int b;
    public int c = 0;
    public Object d;
    public auby e;
    public aubo f;
    public boolean g;

    static {
        aucn aucnVar = new aucn();
        a = aucnVar;
        aihn.registerDefaultInstance(aucn.class, aucnVar);
    }

    private aucn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", auct.class, aucs.class, aucc.class, aubf.class, aucq.class});
        }
        if (iOrdinal == 3) {
            return new aucn();
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
        return aihn.getParserForClass(aucn.class);
    }
}
