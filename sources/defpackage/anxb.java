package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxb extends aihn implements aiis {
    public static final anxb a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        anxb anxbVar = new anxb();
        a = anxbVar;
        aihn.registerDefaultInstance(anxb.class, anxbVar);
    }

    private anxb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", anvw.f, "d", anvw.g, "e"});
        }
        if (iOrdinal == 3) {
            return new anxb();
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
        return aihn.getParserForClass(anxb.class);
    }
}
