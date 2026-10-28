package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcw extends aihn implements aiis {
    public static final apcw a;
    public int b;
    public int c;
    public ajuj d;

    static {
        apcw apcwVar = new apcw();
        a = apcwVar;
        aihn.registerDefaultInstance(apcw.class, apcwVar);
    }

    private apcw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", ajpr.o, "d"});
        }
        if (iOrdinal == 3) {
            return new apcw();
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
        return aihn.getParserForClass(apcw.class);
    }
}
