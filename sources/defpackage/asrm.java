package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrm extends aihn implements aiis {
    public static final asrm a;
    public boolean b;
    public boolean c;
    private int d;

    static {
        asrm asrmVar = new asrm();
        a = asrmVar;
        aihn.registerDefaultInstance(asrm.class, asrmVar);
    }

    private asrm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new asrm();
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
        return aihn.getParserForClass(asrm.class);
    }
}
