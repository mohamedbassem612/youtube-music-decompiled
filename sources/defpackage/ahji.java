package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahji extends aihn implements aiis {
    public static final ahji a;
    public int b;
    public int c;
    public aigj d = aigj.d;
    public ahjg e;

    static {
        ahji ahjiVar = new ahji();
        a = ahjiVar;
        aihn.registerDefaultInstance(ahji.class, ahjiVar);
    }

    private ahji() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahji();
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
        return aihn.getParserForClass(ahji.class);
    }
}
