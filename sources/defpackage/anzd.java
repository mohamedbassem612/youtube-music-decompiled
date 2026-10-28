package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anzd extends aihn implements aiis {
    public static final anzd a;
    public boolean A;
    public anok B;
    public long C;
    public amud H;
    public int b;
    public alay f;
    public aqmh g;
    public int l;
    public long t;
    public long u;
    public anzb v;
    private byte I = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie h = emptyProtobufList();
    public String i = "";
    public String j = "";
    public String k = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String w = "";
    public String x = "";
    public String y = "";
    public String z = "";
    public String D = "";
    public String E = "";
    public String F = "";
    public String G = "";

    static {
        anzd anzdVar = new anzd();
        a = anzdVar;
        aihn.registerDefaultInstance(anzd.class, anzdVar);
    }

    private anzd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                this.I = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004 \u0000\u0001\u0001ϧ \u0000\u0001\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0004\u0004\u001a\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\t\bဈ\n\tဈ\u000b\nဈ\f\u000bဈ\r\fဈ\u000f\rဂ\u0010\u000eဂ\u0011\u000fဉ\u0012\u0010ဈ\u0013\u0011ဈ\u0014\u0012ဈ\u0007\u0013ဈ\u0015\u0014᠌\b\u0015ဈ\u0001\u0016ဈ\u000e\u0017ဈ\u0016\u0018ဇ\u0017\u0019ဉ\u0018\u001aဂ\u0019\u001bဈ\u001a\u001cᐉ\u0003\u001dဈ\u001b\u001eဈ\u001c\u001fဈ\u001dϧᐉ\u001e", new Object[]{"b", "c", "e", "g", "h", "i", "j", "m", "n", "o", "p", "q", "s", "t", "u", "v", "w", "x", "k", "y", "l", amyr.u, "d", "r", "z", "A", "B", "C", "D", "f", "E", "F", "G", "H"});
            case 3:
                return new anzd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzd.class);
            default:
                return null;
        }
    }
}
