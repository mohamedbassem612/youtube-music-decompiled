package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoxy extends aihn implements aiis {
    public static final aoxy a;
    private int b;
    private aniv c;

    static {
        aoxy aoxyVar = new aoxy();
        a = aoxyVar;
        aihn.registerDefaultInstance(aoxy.class, aoxyVar);
    }

    private aoxy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aoxy();
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
        return aihn.getParserForClass(aoxy.class);
    }
}
