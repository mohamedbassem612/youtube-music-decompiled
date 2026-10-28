package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aipd extends aihn implements aiis {
    public static final aipd a;
    public int b;
    public String c = "";
    public int d;

    static {
        aipd aipdVar = new aipd();
        a = aipdVar;
        aihn.registerDefaultInstance(aipd.class, aipdVar);
    }

    private aipd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", aiod.h});
        }
        if (iOrdinal == 3) {
            return new aipd();
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
        return aihn.getParserForClass(aipd.class);
    }
}
