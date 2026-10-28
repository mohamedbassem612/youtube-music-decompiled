package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiah extends aihn implements aiis {
    public static final aiah a;
    public int b = 0;
    public Object c;

    static {
        aiah aiahVar = new aiah();
        a = aiahVar;
        aihn.registerDefaultInstance(aiah.class, aiahVar);
    }

    private aiah() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", aiao.class, aiae.class, aiaf.class, aicc.class, aiai.class, aibx.class, aiap.class});
        }
        if (iOrdinal == 3) {
            return new aiah();
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
        return aihn.getParserForClass(aiah.class);
    }
}
