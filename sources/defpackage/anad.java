package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anad extends aihn implements aiis {
    public static final anad a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        anad anadVar = new anad();
        a = anadVar;
        aihn.registerDefaultInstance(anad.class, anadVar);
    }

    private anad() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0003\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"b", "c", "f", amys.p, "d", amys.q, "e", amys.u});
        }
        if (iOrdinal == 3) {
            return new anad();
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
        return aihn.getParserForClass(anad.class);
    }
}
