package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajaa extends aihn implements aiis {
    public static final ajaa a;
    public boolean b;
    private int c;

    static {
        ajaa ajaaVar = new ajaa();
        a = ajaaVar;
        aihn.registerDefaultInstance(ajaa.class, ajaaVar);
    }

    private ajaa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajaa();
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
        return aihn.getParserForClass(ajaa.class);
    }
}
