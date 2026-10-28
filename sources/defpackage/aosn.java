package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aosn extends aihn implements aiis {
    public static final aosn a;
    public String b = "";
    public int c;
    public int d;
    private int e;

    static {
        aosn aosnVar = new aosn();
        a = aosnVar;
        aihn.registerDefaultInstance(aosn.class, aosnVar);
    }

    private aosn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001\u0004င\u0004", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aosn();
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
        return aihn.getParserForClass(aosn.class);
    }
}
