package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoar extends aihn implements aiis {
    public static final aoar a;
    public int b;
    public int d;
    public int e;
    public int h;
    public boolean i;
    public argn j;
    public String c = "";
    public String f = "";
    public String g = "";
    public String k = "";

    static {
        aoar aoarVar = new aoar();
        a = aoarVar;
        aihn.registerDefaultInstance(aoar.class, aoarVar);
    }

    private aoar() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0006\u0003င\u0007\u0004င\u0001\u0005င\u0002\u0007ဈ\u0005\tဇ\b\u000bဉ\t\fဈ\n", new Object[]{"b", "c", "g", "h", "d", "e", "f", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new aoar();
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
        return aihn.getParserForClass(aoar.class);
    }
}
