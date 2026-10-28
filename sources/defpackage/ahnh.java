package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahnh extends aihn implements aiis {
    public static final ahnh a;
    public long b = -1;
    private int c;

    static {
        ahnh ahnhVar = new ahnh();
        a = ahnhVar;
        aihn.registerDefaultInstance(ahnh.class, ahnhVar);
    }

    private ahnh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ahnh();
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
        return aihn.getParserForClass(ahnh.class);
    }
}
