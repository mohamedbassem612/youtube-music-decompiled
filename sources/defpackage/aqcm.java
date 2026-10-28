package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqcm extends aihn implements aiis {
    public static final aqcm a;
    public int b;
    public int c;
    private int d;

    static {
        aqcm aqcmVar = new aqcm();
        a = aqcmVar;
        aihn.registerDefaultInstance(aqcm.class, aqcmVar);
    }

    private aqcm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001", new Object[]{"d", "b", "c", aqcj.d});
        }
        if (iOrdinal == 3) {
            return new aqcm();
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
        return aihn.getParserForClass(aqcm.class);
    }
}
