package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amov extends aihn implements aiis {
    public static final amov a;
    public int b;
    public alay d;
    public alay e;
    public aqmh f;
    public ajwo g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private byte m = 2;
    public String c = "";

    static {
        amov amovVar = new amov();
        a = amovVar;
        aihn.registerDefaultInstance(amov.class, amovVar);
    }

    private amov() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0000\t\u0001ဈ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\b\nᐉ\t\u000bᐉ\u000b\u0012ᐉ\u0006\u0013ᐉ\u0007\u0014ᐉ\n", new Object[]{"b", "c", "h", "d", "e", "j", "k", "g", "i", "f", "l"});
            case 3:
                return new amov();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amov.class);
            default:
                return null;
        }
    }
}
