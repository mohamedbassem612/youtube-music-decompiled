package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aroi extends aihn implements aiis {
    public static final aroi a;
    public int b;
    public aigj c = aigj.d;
    public int d;

    static {
        aroi aroiVar = new aroi();
        a = aroiVar;
        aihn.registerDefaultInstance(aroi.class, aroiVar);
    }

    private aroi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003᠌\u0002", new Object[]{"b", "c", "d", arke.l});
        }
        if (iOrdinal == 3) {
            return new aroi();
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
        return aihn.getParserForClass(aroi.class);
    }
}
