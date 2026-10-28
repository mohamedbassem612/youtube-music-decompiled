package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqif extends aihn implements aiis {
    public static final aqif a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int j;
    public int n;
    public int o;
    public int p;
    public String h = "";
    public String i = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String q = "";
    public String r = "";

    static {
        aqif aqifVar = new aqif();
        a = aqifVar;
        aihn.registerDefaultInstance(aqif.class, aqifVar);
    }

    private aqif() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\nဈ\t\u000bဈ\n\fဈ\u000b\rင\f\u000eင\r\u0011င\u0010\u0013ဈ\u0011\u0014ဈ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new aqif();
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
        return aihn.getParserForClass(aqif.class);
    }
}
