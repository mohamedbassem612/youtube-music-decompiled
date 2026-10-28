package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyj extends aihn implements aiis {
    public static final ajyj a;
    public int b;
    public aqmh c;
    public alay d;
    public alay e;
    public ajng f;
    public ajng g;
    public alay h;
    public ajng i;
    public apji j;
    public apji l;
    public boolean m;
    private ajng n;
    private ajyi o;
    private ajyh p;
    private alay q;
    private alay r;
    private ajwo s;
    private ajwo t;
    private byte u = 2;
    public String k = "";

    static {
        ajyj ajyjVar = new ajyj();
        a = ajyjVar;
        aihn.registerDefaultInstance(ajyj.class, ajyjVar);
    }

    private ajyj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0002\u0017\u0012\u0000\u0000\u0010\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0007\bᐉ\n\tᐉ\b\nᐉ\t\u000bᐉ\u000b\rᐉ\f\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\u000f\u0013ဈ\u0010\u0014ᐉ\u0011\u0015ဇ\u0012\u0017ᐉ\u0014", new Object[]{"b", "f", "n", "c", "d", "e", "g", "q", "o", "p", "r", "h", "s", "i", "j", "k", "l", "m", "t"});
            case 3:
                return new ajyj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyj.class);
            default:
                return null;
        }
    }
}
