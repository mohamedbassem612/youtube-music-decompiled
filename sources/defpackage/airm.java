package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airm extends aihn implements aiis {
    public static final airm a;
    public int b;
    public aigj c = aigj.d;
    public String d = "";

    static {
        airm airmVar = new airm();
        a = airmVar;
        aihn.registerDefaultInstance(airm.class, airmVar);
    }

    private airm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new airm();
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
        return aihn.getParserForClass(airm.class);
    }
}
