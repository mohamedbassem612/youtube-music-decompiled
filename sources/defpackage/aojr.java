package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojr extends aihn implements aiis {
    public static final aojr a;
    public akwm b;
    private int c;

    static {
        aojr aojrVar = new aojr();
        a = aojrVar;
        aihn.registerDefaultInstance(aojr.class, aojrVar);
    }

    private aojr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf6f3ᮒ\uf6f3ᮒ\u0001\u0000\u0000\u0000\uf6f3ᮒဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aojr();
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
        return aihn.getParserForClass(aojr.class);
    }
}
