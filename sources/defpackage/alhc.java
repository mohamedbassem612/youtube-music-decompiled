package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alhc extends aihn implements aiis {
    public static final alhc a;
    public int b;
    public int c;
    public int d;
    public aigj e = aigj.d;

    static {
        alhc alhcVar = new alhc();
        a = alhcVar;
        aihn.registerDefaultInstance(alhc.class, alhcVar);
    }

    private alhc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ည\u0002", new Object[]{"b", "c", albk.p, "d", albk.q, "e"});
        }
        if (iOrdinal == 3) {
            return new alhc();
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
        return aihn.getParserForClass(alhc.class);
    }
}
