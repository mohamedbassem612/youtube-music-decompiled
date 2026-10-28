package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amrc extends aihn implements aiis {
    public static final amrc a;
    public int b;
    public alay d;
    public int e;
    public int f;
    public int g;
    public akji h;
    public aqmh i;
    public int j;
    public int k;
    public ajwo l;
    public ajwo m;
    public alay o;
    public amqz p;
    public int q;
    private amow r;
    private ajwo s;
    private byte t = 2;
    public String c = "";
    public String n = "";

    static {
        amrc amrcVar = new amrc();
        a = amrcVar;
        aihn.registerDefaultInstance(amrc.class, amrcVar);
    }

    private amrc() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\t\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tᐉ\b\nဋ\t\u000bᐉ\u000b\fဈ\u000e\rဋ\n\u0010ᐉ\u0007\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013᠌\u0013\u0014ᐉ\f\u0015ᐉ\r", new Object[]{"b", "c", "d", "r", "e", "f", "g", "i", "j", "l", "n", "k", "h", "o", "p", "q", aixp.o, "m", "s"});
            case 3:
                return new amrc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amrc.class);
            default:
                return null;
        }
    }
}
