package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ankd extends aihi implements aihj {
    public static final ankd a;
    public int b;
    public alay f;
    public aqmh g;
    public long n;
    public long p;
    public akke q;
    public ankb r;
    public int s;
    public amud y;
    private byte C = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie h = emptyProtobufList();
    public String i = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public aiie o = emptyProtobufList();
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public String x = "";
    public String z = "";
    public String A = "";
    public aigj B = aigj.d;

    static {
        ankd ankdVar = new ankd();
        a = ankdVar;
        aihn.registerDefaultInstance(ankd.class, ankdVar);
    }

    private ankd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0019\u0000\u0001\u0001ϧ\u0019\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0004\u0004\u001a\u0005ဈ\u0006\u000bဈ\b\rဈ\u0007\u000eဂ\t\u000fဈ\u0005\u0011ဂ\n\u0012ဉ\u000b\u0013ဉ\f\u0014ဈ\u000e\u0015᠌\r\u0016ဈ\u000f\u0017ဈ\u0011\u0018ဈ\u0010\u0019ဈ\u0012\u001aဈ\u0014\u001b\u001a\u001cဈ\u0001\u001dဈ\u0015\u001eည\u0016\u001fᐉ\u0003ϧᐉ\u0013", new Object[]{"b", "c", "e", "g", "h", "k", "m", "l", "n", "i", "p", "q", "r", "t", "s", anbz.t, "u", "w", "v", "x", "z", "o", "d", "A", "B", "f", "y"});
            case 3:
                return new ankd();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ankd.class);
            default:
                return null;
        }
    }
}
