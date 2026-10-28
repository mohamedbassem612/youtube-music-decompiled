package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class askf extends aihn implements aiis {
    public static final askf a;
    public int b;
    public aijp c;
    public long d;

    static {
        askf askfVar = new askf();
        a = askfVar;
        aihn.registerDefaultInstance(askf.class, askfVar);
    }

    private askf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဂ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new askf();
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
        return aihn.getParserForClass(askf.class);
    }
}
