package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class argn extends aihn implements aiis {
    public static final argn a;
    public int b;
    public int d;
    public int f;
    public argn g;
    public boolean h;
    public ajva i;
    public aigj c = aigj.d;
    public int e = -1;

    static {
        argn argnVar = new argn();
        a = argnVar;
        aihn.registerDefaultInstance(argn.class, argnVar);
    }

    private argn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0005ဇ\u0005\u0006င\u0003\u0007ဉ\u0004\bဉ\u0006", new Object[]{"b", "c", "d", "e", "h", "f", "g", "i"});
        }
        if (iOrdinal == 3) {
            return new argn();
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
        return aihn.getParserForClass(argn.class);
    }
}
