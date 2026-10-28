package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amwh extends aihn implements aiis {
    public static final amwh a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e;
    public int f;
    public boolean g;
    public amwg h;
    public int i;
    public String j;

    static {
        amwh amwhVar = new amwh();
        a = amwhVar;
        aihn.registerDefaultInstance(amwh.class, amwhVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, amwhVar, amwhVar, null, 196, aika.MESSAGE, amwh.class);
    }

    private amwh() {
        aigj aigjVar = aigj.d;
        this.e = "";
        this.j = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007᠌\u0006\bဈ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", amoe.o, "j"});
        }
        if (iOrdinal == 3) {
            return new amwh();
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
        return aihn.getParserForClass(amwh.class);
    }
}
