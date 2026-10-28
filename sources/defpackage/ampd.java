package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampd extends aihn implements aiis {
    public static final ampd a;
    public int b;
    public long d;
    public alay e;
    public alay g;
    public alay h;
    public aqmh i;
    public alay k;
    public alay l;
    public ajwo m;
    public aigj n;
    public int o;
    private alay p;
    private alay q;
    private ajwo r;
    private byte s = 2;
    public String c = "";
    public String f = "";
    public aiie j = emptyProtobufList();

    static {
        ampd ampdVar = new ampd();
        a = ampdVar;
        aihn.registerDefaultInstance(ampd.class, ampdVar);
    }

    private ampd() {
        emptyProtobufList();
        emptyProtobufList();
        this.n = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u001a\u0010\u0000\u0001\u000b\u0001ᐉ\u0004\u0002ᐉ\u0007\u0003ᐉ\b\u0004ᐉ\u0011\u0005ဈ\u0000\u0006ဃ\u0001\u0007Л\bဈ\u0003\tᐉ\r\nᐉ\u000e\rᐉ\u0002\u000fည\u0014\u0010᠌\u0015\u0011ᐉ\u000f\u0018ᐉ\u0005\u001aᐉ\u0016", new Object[]{"b", "g", "h", "i", "m", "c", "d", "j", amng.class, "f", "k", "l", "e", "n", "o", amoe.g, "q", "p", "r"});
            case 3:
                return new ampd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampd.class);
            default:
                return null;
        }
    }
}
