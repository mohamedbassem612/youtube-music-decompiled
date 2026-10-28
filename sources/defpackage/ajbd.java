package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbd extends aihn implements aiis {
    public static final ajbd a;
    public int b;
    public ajbc c;
    public long d;
    public boolean e;
    public long f;
    public String g = "";
    public String h = "";
    public boolean i;
    public ajbe j;
    public long k;
    public boolean l;
    public boolean m;

    static {
        ajbd ajbdVar = new ajbd();
        a = ajbdVar;
        aihn.registerDefaultInstance(ajbd.class, ajbdVar);
    }

    private ajbd() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0006ဇ\u0004\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\u000eဇ\u000b\u000fဉ\f\u0012ဂ\u000e\u0014ဇ\u0010\u0016ဇ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new ajbd();
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
        return aihn.getParserForClass(ajbd.class);
    }
}
