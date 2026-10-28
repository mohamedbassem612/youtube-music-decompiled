package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afus extends aihn implements aiis {
    public static final afus a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;

    static {
        afus afusVar = new afus();
        a = afusVar;
        aihn.registerDefaultInstance(afus.class, afusVar);
    }

    private afus() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0005\u0006ဇ\b\b᠌\t\tဇ\n\fင\u000b\rင\f\u000eင\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", oia.p, "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new afus();
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
        return aihn.getParserForClass(afus.class);
    }
}
