package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqli extends aihn implements aiis {
    public static final aqli a;
    public int b;
    public aqlh c;
    public int d;

    static {
        aqli aqliVar = new aqli();
        a = aqliVar;
        aihn.registerDefaultInstance(aqli.class, aqliVar);
    }

    private aqli() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ajpr.j});
        }
        if (iOrdinal == 3) {
            return new aqli();
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
        return aihn.getParserForClass(aqli.class);
    }
}
