package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aizm extends aihn implements aiis {
    public static final aizm a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public boolean g;

    static {
        aizm aizmVar = new aizm();
        a = aizmVar;
        aihn.registerDefaultInstance(aizm.class, aizmVar);
    }

    private aizm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003<\u0000\u0004<\u0000\u0005ဇ\u0002", new Object[]{"d", "c", "b", "e", aixp.d, "f", aixp.c, aiys.class, aizn.class, "g"});
        }
        if (iOrdinal == 3) {
            return new aizm();
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
        return aihn.getParserForClass(aizm.class);
    }
}
