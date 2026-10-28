package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class andl extends aihn implements aiis {
    public static final andl a;
    public int b;
    public long c;

    static {
        andl andlVar = new andl();
        a = andlVar;
        aihn.registerDefaultInstance(andl.class, andlVar);
    }

    private andl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new andl();
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
        return aihn.getParserForClass(andl.class);
    }
}
