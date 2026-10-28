package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkm extends aihn implements aiis {
    public static final akkm a;
    public int b;
    public int c;
    private int d;

    static {
        akkm akkmVar = new akkm();
        a = akkmVar;
        aihn.registerDefaultInstance(akkm.class, akkmVar);
    }

    private akkm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new akkm();
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
        return aihn.getParserForClass(akkm.class);
    }
}
