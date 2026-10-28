package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqwp extends aihn implements aiis {
    public static final aqwp a;
    public int b;
    public Object d;
    public alay e;
    public ajwo f;
    public aigj g;
    private ajkc h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private ajwo m;
    public int c = 0;
    private byte n = 2;

    static {
        aqwp aqwpVar = new aqwp();
        a = aqwpVar;
        aihn.registerDefaultInstance(aqwp.class, aqwpVar);
    }

    private aqwp() {
        emptyProtobufList();
        emptyProtobufList();
        this.g = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u0016\u000e\u0000\u0000\r\u0001м\u0000\u0002м\u0000\u0003ᐉ\u0001\u0004ᐉ\t\u0005ည\n\u0007ᐉ\u0002\tᐉ\u0004\nм\u0000\fᐉ\u0005\rᐉ\u0003\u000fм\u0000\u0011м\u0000\u0012ᐉ\u0000\u0016ᐉ\u000b", new Object[]{"d", "c", "b", aqmh.class, alja.class, "e", "f", "g", "i", "k", aqyg.class, "l", "j", aqut.class, apji.class, "h", "m"});
            case 3:
                return new aqwp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwp.class);
            default:
                return null;
        }
    }
}
