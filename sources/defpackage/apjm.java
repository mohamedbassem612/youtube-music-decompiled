package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apjm extends aihn implements aiis {
    public static final apjm a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public long j;
    public boolean k;

    static {
        apjm apjmVar = new apjm();
        a = apjmVar;
        aihn.registerDefaultInstance(apjm.class, apjmVar);
    }

    private apjm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002\u0004င\u0003\u0006ဂ\u0005\bဂ\u0007\rဇ\f\u000eဇ\r\u000fဂ\u000e\u0010ဇ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new apjm();
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
        return aihn.getParserForClass(apjm.class);
    }
}
