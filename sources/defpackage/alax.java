package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alax extends aihn implements aiis {
    public static final alax a;
    public long b;
    public long c;
    private int d;

    static {
        alax alaxVar = new alax();
        a = alaxVar;
        aihn.registerDefaultInstance(alax.class, alaxVar);
    }

    private alax() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new alax();
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
        return aihn.getParserForClass(alax.class);
    }
}
