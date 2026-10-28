package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiya extends aihn implements aiis {
    public static final aiya a;
    public int b;
    public int c;
    public aixs d;
    public aigj e;
    public int f;
    public aigj g;
    public aixz h;
    public boolean i;

    static {
        aiya aiyaVar = new aiya();
        a = aiyaVar;
        aihn.registerDefaultInstance(aiya.class, aiyaVar);
    }

    private aiya() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.g = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004\u0007ဉ\u0005\bဇ\u0006", new Object[]{"b", "c", aixd.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aiya();
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
        return aihn.getParserForClass(aiya.class);
    }
}
