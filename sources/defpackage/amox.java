package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amox extends aihn implements aiis {
    public static final amox a;
    public int b;
    public alay e;
    public alay f;
    public aqmh g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private ajwo m;
    private byte n = 2;
    public String c = "";
    public String d = "";

    static {
        amox amoxVar = new amox();
        a = amoxVar;
        aihn.registerDefaultInstance(amox.class, amoxVar);
    }

    private amox() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\t\u0001ဈ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ဈ\u0003\bᐉ\u000b\nᐉ\b\u000bᐉ\t\rᐉ\u0002\u000eᐉ\n", new Object[]{"b", "c", "e", "f", "i", "g", "d", "m", "j", "k", "h", "l"});
            case 3:
                return new amox();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amox.class);
            default:
                return null;
        }
    }
}
