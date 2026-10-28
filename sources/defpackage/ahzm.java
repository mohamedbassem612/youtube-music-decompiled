package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahzm extends aihn implements aiis {
    public static final ahzm a;
    public int b;
    public float c;
    public int d;
    public int k;
    public int o;
    public boolean p;
    public ahzl r;
    public int s;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public aiie m = emptyProtobufList();
    public aiie n = emptyProtobufList();
    public String q = "";

    static {
        ahzm ahzmVar = new ahzm();
        a = ahzmVar;
        aihn.registerDefaultInstance(ahzm.class, ahzmVar);
    }

    private ahzm() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0019\u0011\u0000\u0002\u0000\u0002ခ\u0000\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nဈ\t\f\u001b\r\u001b\u000e᠌\u000b\u000fဈ\r\u0010ဉ\u000f\u0011᠌\u0010\u0015ဈ\u0004\u0019ဇ\f", new Object[]{"b", "c", "d", ahxv.e, "e", "f", "h", "i", "j", "k", "l", "m", ahyd.class, "n", ahya.class, "o", ahxv.u, "q", "r", "s", ahzf.e, "g", "p"});
        }
        if (iOrdinal == 3) {
            return new ahzm();
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
        return aihn.getParserForClass(ahzm.class);
    }
}
