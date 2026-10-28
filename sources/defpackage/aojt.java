package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojt extends aihn implements aiis {
    public static final aojt a;
    public int b;
    public String c = "";
    public aojr d;
    public aoju e;
    public akjx f;
    public aojq g;
    private int h;

    static {
        aojt aojtVar = new aojt();
        a = aojtVar;
        aihn.registerDefaultInstance(aojt.class, aojtVar);
    }

    private aojt() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0002\u00012\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0014ဉ\u0011\u001bဉ\u00172ဉ)", new Object[]{"b", "h", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aojt();
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
        return aihn.getParserForClass(aojt.class);
    }
}
