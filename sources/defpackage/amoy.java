package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amoy extends aihn implements aiis {
    public static final amoy a;
    public int b;
    public Object d;
    public alay g;
    public alay h;
    public alay i;
    public aqmh j;
    public alay l;
    public ajwo m;
    public aigj n;
    private alay o;
    private alay p;
    private alay q;
    private apji r;
    public int c = 0;
    private byte s = 2;
    public String e = "";
    public String f = "";
    public aiie k = emptyProtobufList();

    static {
        amoy amoyVar = new amoy();
        a = amoyVar;
        aihn.registerDefaultInstance(amoy.class, amoyVar);
    }

    private amoy() {
        emptyProtobufList();
        this.n = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0001\u0001\u0001\u0015\u0011\u0000\u0001\r\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007:\u0000\bм\u0000\tм\u0000\nᐉ\u0006\u000bᐉ\u0007\fЛ\rᐉ\b\u000eᐉ\t\u000fᐉ\u000b\u0013ည\u000f\u0014ᐉ\r\u0015ᐉ\n", new Object[]{"d", "c", "b", "e", "o", "f", "g", "h", alay.class, ampo.class, "i", "j", "k", amng.class, "l", "p", "m", "n", "r", "q"});
            case 3:
                return new amoy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amoy.class);
            default:
                return null;
        }
    }
}
