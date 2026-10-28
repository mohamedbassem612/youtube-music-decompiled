package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anny extends aihn implements aiis {
    public static final anny a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public int f;
    public akoc g;
    public akoc h;
    public apji i;
    public boolean k;
    public ajwo l;
    public boolean m;
    public boolean n;
    public apji o;
    public apji p;
    private alay s;
    private ajwo t;
    private apji u;
    private byte v = 2;
    public aigj j = aigj.d;
    public String q = "";
    public String r = "";

    static {
        anny annyVar = new anny();
        a = annyVar;
        aihn.registerDefaultInstance(anny.class, annyVar);
    }

    private anny() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0007ည\t\tဇ\u000b\nᐉ\f\u000bᐉ\u0005\fᐉ\u000e\rဇ\u000f\u000eဇ\u0010\u000fᐉ\u0011\u0010ᐉ\u0012\u0011ဈ\u0013\u0012ᐉ\u0006\u0013ဈ\u0014\u0014ᐉ\r\u0015ᐉ\u0007", new Object[]{"b", "c", "d", "e", "s", "f", aobi.o, "j", "k", "l", "g", "u", "m", "n", "o", "p", "q", "h", "r", "t", "i"});
            case 3:
                return new anny();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anny.class);
            default:
                return null;
        }
    }
}
