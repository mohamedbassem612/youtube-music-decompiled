package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anuu extends aihi implements aihj {
    public static final anuu a;
    public int b;
    public boolean f;
    public alay g;
    public aqmh h;
    public int i;
    public long k;
    public anuy m;
    public long x;
    private byte A = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie l = emptyProtobufList();
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public String y = "";
    public aigj z = aigj.d;

    static {
        anuu anuuVar = new anuu();
        a = anuuVar;
        aihn.registerDefaultInstance(anuu.class, anuuVar);
    }

    private anuu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0017\u0000\u0001\u0001\u001e\u0017\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0012\u0005ဈ\u000e\u0006ᐉ\u0005\nဈ\u000b\u000bဈ\u000f\fဂ\u0013\u000eဈ\u0010\u000fဈ\u0011\u0010ဈ\f\u0011ဈ\u0002\u0012᠌\u0006\u0013ဂ\u0007\u0014\u001a\u0015ဈ\r\u0016ဈ\u0014\u0017ဈ\n\u001aဉ\b\u001bဈ\t\u001cည\u0015\u001dᐉ\u0004\u001eဇ\u0003", new Object[]{"b", "c", "d", "w", "s", "h", "p", "t", "x", "u", "v", "q", "e", "i", aotj.a, "k", "l", "r", "y", "o", "m", "n", "z", "g", "f"});
            case 3:
                return new anuu();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anuu.class);
            default:
                return null;
        }
    }
}
