package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbm extends aihn implements aiis {
    public static final apbm a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public akxc i;
    public boolean j;
    public boolean k;

    static {
        apbm apbmVar = new apbm();
        a = apbmVar;
        aihn.registerDefaultInstance(apbm.class, apbmVar);
    }

    private apbm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001ဇ\u0000\u0004င\u0003\u0005᠌\u0004\u0006င\u0005\u0007င\u0006\t᠌\b\nဉ\t\fဇ\u000b\u000eဇ\r", new Object[]{"b", "c", "d", "e", aobi.p, "f", "g", "h", aobi.q, "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new apbm();
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
        return aihn.getParserForClass(apbm.class);
    }
}
