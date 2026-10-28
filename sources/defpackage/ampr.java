package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampr extends aihn implements aiis {
    public static final ampr a;
    public int b;
    public ajwo d;
    public aqmh e;
    public alay f;
    public int g;
    public int h;
    public int i;
    public alay j;
    public String k;
    public alay l;
    public aqmh m;
    public int n;
    public int o;
    private int p;
    private alay q;
    private alay r;
    private alay s;
    private alay t;
    private apji u;
    private apji v;
    private apji w;
    private apji x;
    private ajwo y;
    private apji z;
    private byte A = 2;
    public String c = "";

    static {
        ampr amprVar = new ampr();
        a = amprVar;
        aihn.registerDefaultInstance(ampr.class, amprVar);
    }

    private ampr() {
        emptyProtobufList();
        emptyProtobufList();
        this.k = "";
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0001'\u0017\u0000\u0000\u0010\u0001ဈ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\u0007ᐉ\u0005\bဈ\u000e\tᐉ\u000f\u000bᐉ\u0012\rᐉ\u0010\u000eᐉ\u0015\u000fᐉ\u0016\u0011ဋ\n\u0012ᐉ\u000b\u0013င\u0013\u0014င\u0014\u0016ဋ\u0007\u0017ဋ\u0006\u001aᐉ\u001a ᐉ\f#ᐉ\u001b$ᐉ\u001c%ᐉ\u001d&ᐉ!'ᐉ\"", new Object[]{"b", "p", "c", "d", "e", "f", "k", "r", "m", "l", "s", "t", "i", "j", "n", "o", "h", "g", "u", "q", "v", "w", "x", "y", "z"});
            case 3:
                return new ampr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampr.class);
            default:
                return null;
        }
    }
}
