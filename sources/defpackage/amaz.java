package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amaz extends aihn implements aiis {
    public static final amaz a;
    public int b;
    public Object d;
    public Object f;
    public alop g;
    public ambc j;
    public aigj k;
    public aigj l;
    public ajwo m;
    public aigj n;
    public ajwo o;
    private ajwo p;
    private ajwo q;
    private apji r;
    private albe s;
    public int c = 0;
    public int e = 0;
    private byte t = 2;
    public String h = "";
    public String i = "";

    static {
        amaz amazVar = new amaz();
        a = amazVar;
        aihn.registerDefaultInstance(amaz.class, amazVar);
    }

    private amaz() {
        aigj aigjVar = aigj.d;
        this.k = aigjVar;
        this.l = aigjVar;
        this.n = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0011\u0002\u0001\u0001̉\u0011\u0000\u0000\u000b\u0001ᐉ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ᐉ\u0003\u0007=\u0000\bည\u0004\u000bм\u0001\fм\u0001\rည\u0006\u000eᐉ\u0007\u000fм\u0000\u0011ᐉ\b\u0012ည\t\u0013ᐉ\n\u0014ᐉ\f\u0016ᐉ\u000b̉ᐉ\u000e", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", "j", "k", ajwo.class, ajwo.class, "l", "p", apji.class, "m", "n", "q", "o", "r", "s"});
            case 3:
                return new amaz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amaz.class);
            default:
                return null;
        }
    }
}
