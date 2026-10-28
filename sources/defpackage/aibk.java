package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aibk extends aihn implements aiis {
    public static final aibk a;
    public int b;
    public aial c;
    public int d;

    static {
        aibk aibkVar = new aibk();
        a = aibkVar;
        aihn.registerDefaultInstance(aibk.class, aibkVar);
    }

    private aibk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ahzf.q});
        }
        if (iOrdinal == 3) {
            return new aibk();
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
        return aihn.getParserForClass(aibk.class);
    }
}
