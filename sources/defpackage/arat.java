package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arat extends aihn implements aiis {
    public static final arat a;
    public int b;
    public aqmh c;
    public aqmh d;
    public alay e;
    public alay f;
    public ajng g;
    public ajng h;
    public boolean k;
    public aodl l;
    private alay n;
    private ajwo o;
    private alay p;
    private ajwo q;
    private alay r;
    private byte s = 2;
    public aigj i = aigj.d;
    public aiie j = emptyProtobufList();
    public aiie m = emptyProtobufList();

    static {
        arat aratVar = new arat();
        a = aratVar;
        aihn.registerDefaultInstance(arat.class, aratVar);
    }

    private arat() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0004\u001f\u0010\u0000\u0002\r\u0004ᐉ\u0012\u0005ᐉ\u0013\u0006ᐉ\u0014\bည\u000b\tᐉ\u0002\nᐉ\u0000\u000bᐉ\u0005\fᐉ\u0006\rᐉ\f\u000eᐉ\b\u000fᐉ\t\u0010Л\u0011ဇ\r\u0014ᐉ\u0016\u001a\u001b\u001fᐉ\u0007", new Object[]{"b", "p", "q", "r", "i", "d", "c", "e", "f", "o", "g", "h", "j", ajwo.class, "k", "l", "m", ajub.class, "n"});
            case 3:
                return new arat();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arat.class);
            default:
                return null;
        }
    }
}
