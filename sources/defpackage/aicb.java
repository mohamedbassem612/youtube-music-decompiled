package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicb extends aihn implements aiis {
    public static final aicb a;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public aigj f = aigj.d;

    static {
        aicb aicbVar = new aicb();
        a = aicbVar;
        aihn.registerDefaultInstance(aicb.class, aicbVar);
    }

    private aicb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002\u0006ည\u0003", new Object[]{"b", "d", "c", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aicb();
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
        return aihn.getParserForClass(aicb.class);
    }
}
