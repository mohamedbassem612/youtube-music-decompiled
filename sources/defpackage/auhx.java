package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auhx extends aihn implements aiis {
    public static final auhx a;
    public int b;
    public aigj c;

    static {
        auhx auhxVar = new auhx();
        a = auhxVar;
        aihn.registerDefaultInstance(auhx.class, auhxVar);
    }

    private auhx() {
        aigj aigjVar = aigj.d;
        this.c = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ည\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new auhx();
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
        return aihn.getParserForClass(auhx.class);
    }
}
