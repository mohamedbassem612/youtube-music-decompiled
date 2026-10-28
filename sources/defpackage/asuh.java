package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asuh extends aihn implements aiis {
    public static final asuh a;
    public Object c;
    public Object e;
    public Object g;
    public int b = 0;
    public int d = 0;
    public int f = 0;

    static {
        asuh asuhVar = new asuh();
        a = asuhVar;
        aihn.registerDefaultInstance(asuh.class, asuhVar);
    }

    private asuh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0003\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0001\u0004<\u0001\u0005<\u0002\u0006<\u0002", new Object[]{"c", "b", "e", "d", "g", "f", astw.class, astv.class, asuf.class, asue.class, asub.class, asua.class});
        }
        if (iOrdinal == 3) {
            return new asuh();
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
        return aihn.getParserForClass(asuh.class);
    }
}
