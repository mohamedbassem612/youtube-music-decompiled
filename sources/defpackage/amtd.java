package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amtd extends aihn implements aiis {
    public static final amtd a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;
    public boolean g;

    static {
        amtd amtdVar = new amtd();
        a = amtdVar;
        aihn.registerDefaultInstance(amtd.class, amtdVar);
    }

    private amtd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဂ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new amtd();
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
        return aihn.getParserForClass(amtd.class);
    }
}
