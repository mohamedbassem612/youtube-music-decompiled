package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aksg extends aihn implements aiis {
    public static final aksg a;
    public int b;
    public int d;
    public int g;
    public aksf j;
    public aksd k;
    public int m;
    public aksc n;
    public float p;
    public int q;
    public int c = 120;
    public String e = "";
    public String f = "";
    public aihv h = emptyIntList();
    public String i = "";
    public String l = "";
    public String o = "";

    static {
        aksg aksgVar = new aksg();
        a = aksgVar;
        aihn.registerDefaultInstance(aksg.class, aksgVar);
    }

    private aksg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\bဈ\u0005\tဉ\u0006\n\u0016\u000bဉ\u0007\fဈ\b\rင\t\u000eဉ\n\u000fဈ\u000b\u0010ခ\f\u0011င\r", new Object[]{"b", "c", asel.t, "d", aqvi.f, "e", "f", "g", "i", "j", "h", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (iOrdinal == 3) {
            return new aksg();
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
        return aihn.getParserForClass(aksg.class);
    }
}
