package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucg extends aihn implements aiis {
    public static final aucg a;
    public int b;
    public int c = 0;
    public Object d;
    public aucb e;

    static {
        aucg aucgVar = new aucg();
        a = aucgVar;
        aihn.registerDefaultInstance(aucg.class, aucgVar);
    }

    private aucg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", aucp.class, aucd.class, auci.class});
        }
        if (iOrdinal == 3) {
            return new aucg();
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
        return aihn.getParserForClass(aucg.class);
    }
}
