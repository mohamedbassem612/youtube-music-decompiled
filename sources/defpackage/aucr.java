package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aucr extends aihn implements aiis {
    public static final aucr a;
    public int b;
    public int c;
    public int d;

    static {
        aucr aucrVar = new aucr();
        a = aucrVar;
        aihn.registerDefaultInstance(aucr.class, aucrVar);
    }

    private aucr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = audg.c;
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", aihtVar, "d", aihtVar});
        }
        if (iOrdinal == 3) {
            return new aucr();
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
        return aihn.getParserForClass(aucr.class);
    }
}
