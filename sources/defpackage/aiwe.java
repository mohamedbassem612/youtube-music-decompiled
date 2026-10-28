package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiwe extends aihn implements aiis {
    public static final aiwe a;
    public int b;
    public float c;
    public long d;
    private int e;

    static {
        aiwe aiweVar = new aiwe();
        a = aiweVar;
        aihn.registerDefaultInstance(aiwe.class, aiweVar);
    }

    private aiwe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"e", "b", aiwd.a, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiwe();
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
        return aihn.getParserForClass(aiwe.class);
    }
}
