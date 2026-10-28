package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicu extends aihn implements aiis {
    public static final aicu a;
    public aicr b;
    public String c = "";
    public int d;
    private int e;

    static {
        aicu aicuVar = new aicu();
        a = aicuVar;
        aihn.registerDefaultInstance(aicu.class, aicuVar);
    }

    private aicu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဌ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aicu();
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
        return aihn.getParserForClass(aicu.class);
    }
}
