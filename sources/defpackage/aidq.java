package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aidq extends aihn implements aiis {
    public static final aidq a;
    public aien A;
    public boolean B;
    public int b;
    public Object d;
    public long h;
    public aido k;
    public int l;
    public aidp m;
    public aidc o;
    public int q;
    public int s;
    public boolean t;
    public int u;
    public aiet x;
    public aicj y;
    public aiem z;
    public int c = 0;
    public String e = "";
    public String f = "";
    public aiie g = emptyProtobufList();
    public String i = "";
    public String j = "";
    public String n = "";
    public String p = "";
    public String r = "";
    public String v = "";
    public String w = "";

    static {
        aidq aidqVar = new aidq();
        a = aidqVar;
        aihn.registerDefaultInstance(aidq.class, aidqVar);
    }

    private aidq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u001c\u0001\u0001\u0001\u001e\u001c\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဂ\u0003\u0006ဈ\u0004\u0007<\u0000\bဈ\u0005\tဉ\u0006\n᠌\u0007\u000bဉ\b\fဈ\t\rဉ\n\u000eဈ\u000b\u000fင\f\u0010ဈ\r\u0011᠌\u000e\u0012ဇ\u000f\u0013ဈ\u0011\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0019ဇ\u0018\u001a᠌\u0010\u001b<\u0000\u001cဈ\u0012\u001d<\u0000\u001e<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", aieg.class, "h", "i", aidg.class, "j", "k", "l", ahzf.t, "m", "n", "o", "p", "q", "r", "s", aidl.b, "t", "v", "x", "y", "z", "A", "B", "u", aidl.c, aidn.class, "w", aidb.class, aicv.class});
        }
        if (iOrdinal == 3) {
            return new aidq();
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
        return aihn.getParserForClass(aidq.class);
    }
}
