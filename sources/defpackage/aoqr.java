package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoqr extends aihn implements aiis {
    public static final aoqr a;
    public int b;
    public int c;
    public long d;

    static {
        aoqr aoqrVar = new aoqr();
        a = aoqrVar;
        aihn.registerDefaultInstance(aoqr.class, aoqrVar);
    }

    private aoqr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဂ\u0002", new Object[]{"b", "c", aobi.i, "d"});
        }
        if (iOrdinal == 3) {
            return new aoqr();
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
        return aihn.getParserForClass(aoqr.class);
    }
}
