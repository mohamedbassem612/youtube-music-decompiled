package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akuo extends aihn implements aiis {
    public static final akuo a;
    public int b;
    public Object d;
    public alay e;
    public apji f;
    public alay g;
    public akup h;
    public alay i;
    public apji j;
    public boolean l;
    public apji m;
    public int n;
    public ajwo o;
    public apji p;
    public apji q;
    public apji r;
    private apji s;
    private apji t;
    private apji u;
    private apji v;
    private ajwo w;
    private ajwo x;
    public int c = 0;
    private byte y = 2;
    public aiie k = emptyProtobufList();

    static {
        akuo akuoVar = new akuo();
        a = akuoVar;
        aihn.registerDefaultInstance(akuo.class, akuoVar);
    }

    private akuo() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0001\u0001\u0001\u001d\u0016\u0000\u0001\u0014\u0001ᐉ\u0001\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u000b\nᐉ\u0011\rм\u0000\u000eဇ\t\u000fᐉ\u000e\u0010ᐉ\u0012\u0011ᐉ\u0013\u0013ᐉ\u000f\u0014᠌\f\u0015ᐉ\r\u0016ᐉ\n\u0017ᐉ\u0015\u0019Л\u001aᐉ\u0007\u001cм\u0000\u001dᐉ\u0018", new Object[]{"d", "c", "b", "e", "g", "h", "f", "i", "j", "t", "v", aqmh.class, "l", "u", "w", "x", "p", "n", akjs.r, "o", "m", "q", "k", apji.class, "s", asnm.class, "r"});
            case 3:
                return new akuo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akuo.class);
            default:
                return null;
        }
    }
}
