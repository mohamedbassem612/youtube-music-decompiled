package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrs extends aihn implements aiis {
    public static final asrs a;
    public int b;
    public aijp d;
    public int e;
    public asrt g;
    private aiip h = aiip.a;
    public String c = "";
    public String f = "";

    static {
        asrs asrsVar = new asrs();
        a = asrsVar;
        aihn.registerDefaultInstance(asrs.class, asrsVar);
    }

    private asrs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", asmm.r, "f", "h", new ahud(aika.STRING, "", aika.MESSAGE, aifv.a), "g"});
        }
        if (iOrdinal == 3) {
            return new asrs();
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
        return aihn.getParserForClass(asrs.class);
    }
}
