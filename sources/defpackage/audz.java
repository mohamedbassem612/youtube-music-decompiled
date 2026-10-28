package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audz extends aihn implements aiis {
    public static final audz a;
    public int b = 0;
    public Object c;

    static {
        audz audzVar = new audz();
        a = audzVar;
        aihn.registerDefaultInstance(audz.class, audzVar);
    }

    private audz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", aucu.class, aioz.class});
        }
        if (iOrdinal == 3) {
            return new audz();
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
        return aihn.getParserForClass(audz.class);
    }
}
