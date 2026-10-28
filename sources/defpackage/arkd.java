package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arkd extends aihn implements aiis {
    public static final arkd a;
    public int b;
    public boolean g;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        arkd arkdVar = new arkd();
        a = arkdVar;
        aihn.registerDefaultInstance(arkd.class, arkdVar);
    }

    private arkd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0006\u0006ဈ\u0005\bဇ\u0007\tဇ\b\nဇ\t\fဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "i", "h", "j", "k", "l", "g"});
        }
        if (iOrdinal == 3) {
            return new arkd();
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
        return aihn.getParserForClass(arkd.class);
    }
}
