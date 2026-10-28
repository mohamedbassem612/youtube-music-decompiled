package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asqp extends aihn implements aiis {
    public static final asqp a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        asqp asqpVar = new asqp();
        a = asqpVar;
        aihn.registerDefaultInstance(asqp.class, asqpVar);
    }

    private asqp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0003ဈ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (iOrdinal == 3) {
            return new asqp();
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
        return aihn.getParserForClass(asqp.class);
    }
}
