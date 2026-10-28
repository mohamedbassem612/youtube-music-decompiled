package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahyr extends aihn implements aiis {
    public static final ahyr a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        ahyr ahyrVar = new ahyr();
        a = ahyrVar;
        aihn.registerDefaultInstance(ahyr.class, ahyrVar);
    }

    private ahyr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = ahxv.o;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", ahxv.n, "e", aihtVar, "f", aihtVar});
        }
        if (iOrdinal == 3) {
            return new ahyr();
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
        return aihn.getParserForClass(ahyr.class);
    }
}
