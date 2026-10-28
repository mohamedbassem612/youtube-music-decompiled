package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvf extends aihn implements aiis {
    public static final alvf a;
    public int b;
    public long d;
    public long e;
    public boolean g;
    public boolean h;
    public alve j;
    public boolean k;
    public String c = "";
    public String f = "";
    public aigj i = aigj.d;

    static {
        alvf alvfVar = new alvf();
        a = alvfVar;
        aihn.registerDefaultInstance(alvf.class, alvfVar);
    }

    private alvf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bည\u0006\tဉ\u0007\nဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new alvf();
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
        return aihn.getParserForClass(alvf.class);
    }
}
