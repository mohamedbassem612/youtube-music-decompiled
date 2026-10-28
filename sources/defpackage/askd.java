package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class askd extends aihn implements aiis {
    public static final askd a;
    public int b;
    public aijp c;
    public andh d;
    public long e;

    static {
        askd askdVar = new askd();
        a = askdVar;
        aihn.registerDefaultInstance(askd.class, askdVar);
    }

    private askd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0000\u0003ဂ\u0002", new Object[]{"b", "d", "c", "e"});
        }
        if (iOrdinal == 3) {
            return new askd();
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
        return aihn.getParserForClass(askd.class);
    }
}
