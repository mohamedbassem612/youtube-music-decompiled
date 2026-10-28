package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfe extends aihn implements aiis {
    public static final anfe a;
    public boolean b;
    public int c;
    public boolean d;
    private int e;

    static {
        anfe anfeVar = new anfe();
        a = anfeVar;
        aihn.registerDefaultInstance(anfe.class, anfeVar);
    }

    private anfe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\r\u0003\u0000\u0000\u0000\u0004ဇ\u0003\u0005င\u0004\rဇ\f", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new anfe();
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
        return aihn.getParserForClass(anfe.class);
    }
}
