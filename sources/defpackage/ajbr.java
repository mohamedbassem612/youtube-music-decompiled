package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajbr extends aihn implements aiis {
    public static final ajbr a;
    public int b;
    public ajbq c;

    static {
        ajbr ajbrVar = new ajbr();
        a = ajbrVar;
        aihn.registerDefaultInstance(ajbr.class, ajbrVar);
    }

    private ajbr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ajbr();
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
        return aihn.getParserForClass(ajbr.class);
    }
}
