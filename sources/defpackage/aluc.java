package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluc extends aihn implements aiis {
    public static final aluc a;
    public int b;
    public Object d;
    public alud f;
    public boolean g;
    public int h;
    public aogm i;
    public boolean j;
    public boolean k;
    public appy m;
    public int c = 0;
    public String e = "";
    public aigj l = aigj.d;

    static {
        aluc alucVar = new aluc();
        a = alucVar;
        aihn.registerDefaultInstance(aluc.class, alucVar);
    }

    private aluc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003ဉ\u0001\u0004ဇ\u0002\u0005င\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bဇ\u0006\tည\u0007\nဉ\b\u000b<\u0000", new Object[]{"d", "c", "b", "e", alty.class, "f", "g", "h", "i", "j", "k", "l", "m", altz.class});
        }
        if (iOrdinal == 3) {
            return new aluc();
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
        return aihn.getParserForClass(aluc.class);
    }
}
