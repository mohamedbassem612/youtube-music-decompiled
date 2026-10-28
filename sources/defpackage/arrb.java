package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arrb extends aihn implements aiis {
    public static final arrb a;
    public int b;
    public int c;

    static {
        arrb arrbVar = new arrb();
        a = arrbVar;
        aihn.registerDefaultInstance(arrb.class, arrbVar);
    }

    private arrb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", arke.q});
        }
        if (iOrdinal == 3) {
            return new arrb();
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
        return aihn.getParserForClass(arrb.class);
    }
}
