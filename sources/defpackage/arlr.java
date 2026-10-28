package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arlr extends aihn implements aiis {
    public static final arlr a;
    public int b = 0;
    private Object c;

    static {
        arlr arlrVar = new arlr();
        a = arlrVar;
        aihn.registerDefaultInstance(arlr.class, arlrVar);
    }

    private arlr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000", new Object[]{"c", "b", arlv.class, arlw.class});
        }
        if (iOrdinal == 3) {
            return new arlr();
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
        return aihn.getParserForClass(arlr.class);
    }
}
