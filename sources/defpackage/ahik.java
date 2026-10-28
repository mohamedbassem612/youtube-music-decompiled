package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahik extends aihn implements aiis {
    public static final ahik a;
    public int b;
    public int c;
    public ahil d;
    public aigj e = aigj.d;

    static {
        ahik ahikVar = new ahik();
        a = ahikVar;
        aihn.registerDefaultInstance(ahik.class, ahikVar);
    }

    private ahik() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahik();
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
        return aihn.getParserForClass(ahik.class);
    }
}
