package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ankb extends aihn implements aiis {
    public static final ankb a;
    public int b;
    public int c;

    static {
        ankb ankbVar = new ankb();
        a = ankbVar;
        aihn.registerDefaultInstance(ankb.class, ankbVar);
    }

    private ankb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", anms.e});
        }
        if (iOrdinal == 3) {
            return new ankb();
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
        return aihn.getParserForClass(ankb.class);
    }
}
