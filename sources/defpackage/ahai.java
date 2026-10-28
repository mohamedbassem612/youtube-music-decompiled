package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahai extends aihn implements aiis {
    public static final ahai a;
    public int b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean k;
    public String c = "";
    public String e = "";
    public String j = "";

    static {
        ahai ahaiVar = new ahai();
        a = ahaiVar;
        aihn.registerDefaultInstance(ahai.class, ahaiVar);
    }

    private ahai() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (iOrdinal == 3) {
            return new ahai();
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
        return aihn.getParserForClass(ahai.class);
    }
}
