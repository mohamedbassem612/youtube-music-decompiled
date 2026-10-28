package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajno extends aihn implements aiis {
    public static final ajno a;
    public int b;
    public boolean c;
    public boolean d;
    public alja e;
    public alay f;
    public ajwo g;
    public alja h;
    public alay i;
    public ajwo j;
    public aiqd k;
    public aiqe l;
    public aiqe m;
    private ajwo o;
    private ajwo p;
    private ajwo q;
    private ajwo r;
    private byte s = 2;
    public aigj n = aigj.d;

    static {
        ajno ajnoVar = new ajno();
        a = ajnoVar;
        aihn.registerDefaultInstance(ajno.class, ajnoVar);
    }

    private ajno() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0003\u001d\u0010\u0000\u0000\n\u0003ဇ\u0001\u0004ဇ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\t\bᐉ\f\tᐉ\r\nᐉ\u000f\u000bဉ\u0013\rည\u001b\u0011ᐉ\n\u0013ဉ\u0014\u0014ဉ\u0015\u001bᐉ\u0019\u001cᐉ\u000b\u001dᐉ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "o", "l", "m", "r", "p", "q"});
            case 3:
                return new ajno();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajno.class);
            default:
                return null;
        }
    }
}
