package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amkl extends aihn implements aiis {
    public static final amkl a;
    public int b;
    public alay c;
    public alay d;
    public int f;
    public alay g;
    public alay h;
    public alay i;
    public apji j;
    public apji k;
    public alay l;
    public alay m;
    public ajng n;
    private alay o;
    private alay p;
    private ajng q;
    private byte r = 2;
    public String e = "";

    static {
        amkl amklVar = new amkl();
        a = amklVar;
        aihn.registerDefaultInstance(amkl.class, amklVar);
    }

    private amkl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0005\u0003ᐉ\u0006\u0005ᐉ\u0007\u0007ᐉ\b\tᐉ\t\nᐉ\n\fᐉ\u0001\rᐉ\u000b\u000eᐉ\f\u000fᐉ\u000e\u0010ᐉ\u0002\u0011ᐉ\u000f\u0012င\u0004\u0014ဈ\u0003", new Object[]{"b", "c", "g", "h", "i", "j", "k", "p", "d", "l", "m", "n", "o", "q", "f", "e"});
            case 3:
                return new amkl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amkl.class);
            default:
                return null;
        }
    }
}
