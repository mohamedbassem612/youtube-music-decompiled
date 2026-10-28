package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class almc extends aihn implements aiis {
    public static final almc a;
    public int b;
    public aoih c;
    public anqd d;
    private almi e;

    static {
        almc almcVar = new almc();
        a = almcVar;
        aihn.registerDefaultInstance(almc.class, almcVar);
    }

    private almc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0007ဉ\u0006", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new almc();
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
        return aihn.getParserForClass(almc.class);
    }
}
