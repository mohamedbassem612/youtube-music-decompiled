package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akhp extends aihn implements aiis {
    public static final akhp a;
    public int b;
    public String c = "";
    public akhq d;
    public int e;

    static {
        akhp akhpVar = new akhp();
        a = akhpVar;
        aihn.registerDefaultInstance(akhp.class, akhpVar);
    }

    private akhp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", anbz.o});
        }
        if (iOrdinal == 3) {
            return new akhp();
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
        return aihn.getParserForClass(akhp.class);
    }
}
