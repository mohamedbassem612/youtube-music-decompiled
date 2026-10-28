package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbe extends aihn implements aiis {
    public static final ajbe a;
    public int b;
    private int c;

    static {
        ajbe ajbeVar = new ajbe();
        a = ajbeVar;
        aihn.registerDefaultInstance(ajbe.class, ajbeVar);
    }

    private ajbe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", aixp.h});
        }
        if (iOrdinal == 3) {
            return new ajbe();
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
        return aihn.getParserForClass(ajbe.class);
    }
}
