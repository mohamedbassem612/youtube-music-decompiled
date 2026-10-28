package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aibv extends aihn implements aiis {
    public static final aibv a;
    public int b;
    public float c;
    public int d;
    public int k;
    public int p;
    public boolean q;
    public aiej s;
    public aiew t;
    public int u;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public aiie n = emptyProtobufList();
    public aiie o = emptyProtobufList();
    public String r = "";

    static {
        aibv aibvVar = new aibv();
        a = aibvVar;
        aihn.registerDefaultInstance(aibv.class, aibvVar);
    }

    private aibv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0013\u0000\u0001\u0002\u001a\u0013\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဈ\u0007\u0007င\b\bဈ\t\t᠌\u0001\nဈ\u0002\u000bဈ\n\f\u001b\r\u001b\u000e᠌\u000b\u000fဈ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012᠌\u0010\u0018ဈ\u0004\u001aဇ\f", new Object[]{"b", "c", "f", "h", "i", "j", "k", "l", "d", aibu.a, "e", "m", "n", aibr.class, "o", aibt.class, "p", fxi.t, "r", "s", "t", "u", fxi.s, "g", "q"});
        }
        if (iOrdinal == 3) {
            return new aibv();
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
        return aihn.getParserForClass(aibv.class);
    }
}
