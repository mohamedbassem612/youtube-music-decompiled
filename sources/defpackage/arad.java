package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arad extends aihn implements aiis {
    public static final arad a;
    public int b;
    public int c;
    public int d;

    static {
        arad aradVar = new arad();
        a = aradVar;
        aihn.registerDefaultInstance(arad.class, aradVar);
    }

    private arad() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", aram.a, "d", aram.c});
        }
        if (iOrdinal == 3) {
            return new arad();
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
        return aihn.getParserForClass(arad.class);
    }
}
