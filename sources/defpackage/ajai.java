package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajai extends aihn implements aiis {
    public static final ajai a;
    public int b;
    public int c;

    static {
        ajai ajaiVar = new ajai();
        a = ajaiVar;
        aihn.registerDefaultInstance(ajai.class, ajaiVar);
    }

    private ajai() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", aixp.e});
        }
        if (iOrdinal == 3) {
            return new ajai();
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
        return aihn.getParserForClass(ajai.class);
    }
}
