package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajza extends aihn implements aiis {
    public static final ajza a;
    public int b;
    public ajyf c;
    public apji d;
    public apji e;
    public ajyt f;
    public ajyo g;
    public ajyz i;
    public int j;
    private apji k;
    private apji l;
    private apji m;
    private alay n;
    private alay o;
    private alay p;
    private ajzd q;
    private alay r;
    private byte s = 2;
    public aigj h = aigj.d;

    static {
        ajza ajzaVar = new ajza();
        a = ajzaVar;
        aihn.registerDefaultInstance(ajza.class, ajzaVar);
    }

    private ajza() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0019\u0010\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0006\u0003ᐉ\b\u0004ᐉ\t\u0006ည\n\bᐉ\r\tဉ\u000e\u000bᐉ\u0010\fᐉ\u0007\r᠌\u0011\u0010ᐉ\u0003\u0011ᐉ\u0002\u0013ᐉ\u0005\u0014ᐉ\u0014\u0015ᐉ\u0004\u0019ᐉ\u0001", new Object[]{"b", "c", "f", "n", "o", "h", "p", "i", "q", "g", "j", ajpr.u, "e", "d", "m", "r", "l", "k"});
            case 3:
                return new ajza();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajza.class);
            default:
                return null;
        }
    }
}
