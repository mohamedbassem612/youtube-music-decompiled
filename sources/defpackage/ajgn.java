package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgn extends aihn implements aiis {
    public static final ajgn a;
    public int b;
    public int c = 0;
    public Object d;
    public ajgl e;

    static {
        ajgn ajgnVar = new ajgn();
        a = ajgnVar;
        aihn.registerDefaultInstance(ajgn.class, ajgnVar);
    }

    private ajgn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002;\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", ajgm.class});
        }
        if (iOrdinal == 3) {
            return new ajgn();
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
        return aihn.getParserForClass(ajgn.class);
    }
}
