package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amks extends aihi implements aihj {
    public static final amks a;
    public int b;
    public amlh c;
    public int d;
    public boolean f;
    public ajwo h;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private ajwo s;
    private byte t = 2;
    public aigj e = aigj.d;
    public aiie g = emptyProtobufList();
    public String i = "";

    static {
        amks amksVar = new amks();
        a = amksVar;
        aihn.registerDefaultInstance(amks.class, amksVar);
    }

    private amks() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0001\u000b\u0001ဉ\u0000\u0002᠌\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\b\tᐉ\t\nᐉ\n\u000bည\f\rဇ\r\u000fЛ\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ဈ\u0011\u0013ᐉ\u0006\u0014ᐉ\u000b", new Object[]{"b", "c", "d", amjn.s, "k", "l", "m", "o", "p", "q", "e", "f", "g", ajwo.class, "h", "s", "i", "n", "r"});
            case 3:
                return new amks();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amks.class);
            default:
                return null;
        }
    }
}
