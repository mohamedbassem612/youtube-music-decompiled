package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akkl extends aihn implements aiis {
    public static final akkl a;
    public int b;
    public int c;
    public int d;
    public akkm e;

    static {
        akkl akklVar = new akkl();
        a = akklVar;
        aihn.registerDefaultInstance(akkl.class, akklVar);
    }

    private akkl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new akkl();
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
        return aihn.getParserForClass(akkl.class);
    }
}
