package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpe extends aihn implements aiis {
    public static final atpe a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int j;
    public long k;
    public long l;
    public int n;
    public String g = "";
    public String h = "";
    public String i = "";
    public String m = "";

    static {
        atpe atpeVar = new atpe();
        a = atpeVar;
        aihn.registerDefaultInstance(atpe.class, atpeVar);
    }

    private atpe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဈ\u0005\bဈ\u0007\tဈ\b\nင\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eင\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new atpe();
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
        return aihn.getParserForClass(atpe.class);
    }
}
