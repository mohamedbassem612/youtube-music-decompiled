package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jrh extends aihn implements aiis {
    public static final jrh a;
    public int b;
    public int d;
    public long i;
    public long k;
    public int l;
    public long m;
    public long n;
    public long o;
    public int r;
    public String c = "";
    public String e = "";
    public aiie f = emptyProtobufList();
    public aihv g = emptyIntList();
    public aigj h = aigj.d;
    public String j = "";
    public aihy p = emptyLongList();
    public String q = "";

    static {
        jrh jrhVar = new jrh();
        a = jrhVar;
        aihn.registerDefaultInstance(jrh.class, jrhVar);
    }

    private jrh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0003\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဈ\u0003\u0005\u001b\u0006ည\u0004\u0007ဂ\u0005\bဈ\u0006\tဂ\u0007\nင\b\u000bဂ\t\fဂ\n\rဂ\u000b\u000e\u0014\u000fဈ\f\u0010\u0016\u0011င\r", new Object[]{"b", "c", "d", "e", "f", jrd.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "g", "r"});
        }
        if (iOrdinal == 3) {
            return new jrh();
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
        return aihn.getParserForClass(jrh.class);
    }
}
