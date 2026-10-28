package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgr extends aihn implements aiis {
    public static final axgr a;
    public int b;
    public int c = -1;

    static {
        axgr axgrVar = new axgr();
        a = axgrVar;
        aihn.registerDefaultInstance(axgr.class, axgrVar);
    }

    private axgr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", audg.p});
        }
        if (iOrdinal == 3) {
            return new axgr();
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
        return aihn.getParserForClass(axgr.class);
    }
}
