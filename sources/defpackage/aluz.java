package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluz extends aihn implements aiis {
    public static final aihw a = new aiat(12);
    public static final aluz b;
    public aihv c = emptyIntList();
    public String d = "";
    public alva e;
    private int f;

    static {
        aluz aluzVar = new aluz();
        b = aluzVar;
        aihn.registerDefaultInstance(aluz.class, aluzVar);
    }

    private aluz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ\u0003ဉ\u0001", new Object[]{"f", "d", "c", aofw.c, "e"});
        }
        if (iOrdinal == 3) {
            return new aluz();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aluz.class);
    }
}
