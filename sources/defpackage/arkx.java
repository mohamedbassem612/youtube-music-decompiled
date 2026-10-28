package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arkx extends aihn implements aiis {
    public static final arkx a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        arkx arkxVar = new arkx();
        a = arkxVar;
        aihn.registerDefaultInstance(arkx.class, arkxVar);
    }

    private arkx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", "f", armd.class, arlu.class, arlm.class, armp.class});
        }
        if (iOrdinal == 3) {
            return new arkx();
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
        return aihn.getParserForClass(arkx.class);
    }
}
