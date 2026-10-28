package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pyl extends aihn implements aiis {
    public static final pyl a;
    public int b = 0;
    public Object c;

    static {
        pyl pylVar = new pyl();
        a = pylVar;
        aihn.registerDefaultInstance(pyl.class, pylVar);
    }

    private pyl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", pyi.class, pyk.class, pyj.class, pyg.class, pyh.class});
        }
        if (iOrdinal == 3) {
            return new pyl();
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
        return aihn.getParserForClass(pyl.class);
    }
}
