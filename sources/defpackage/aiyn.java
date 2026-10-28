package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiyn extends aihn implements aiis {
    public static final aiyn a;
    public int b;
    public int c;
    public aigj d = aigj.d;

    static {
        aiyn aiynVar = new aiyn();
        a = aiynVar;
        aihn.registerDefaultInstance(aiyn.class, aiynVar);
    }

    private aiyn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003᠌\u0002\u0004ည\u0003", new Object[]{"b", "c", aixp.b, "d"});
        }
        if (iOrdinal == 3) {
            return new aiyn();
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
        return aihn.getParserForClass(aiyn.class);
    }
}
