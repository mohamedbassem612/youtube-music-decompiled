package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amzh extends aihn implements aiis {
    public static final amzh a;
    public int b;
    public aqmh c;
    public aqmh d;
    public alja e;
    public alay f;
    public amzg h;
    public amzg i;
    public int j;
    public boolean m;
    private ajwo o;
    private ajwo p;
    private alay q;
    private byte r = 2;
    public aiie g = emptyProtobufList();
    public aigj k = aigj.d;
    public aiie l = emptyProtobufList();
    public aiie n = emptyProtobufList();

    static {
        amzh amzhVar = new amzh();
        a = amzhVar;
        aihn.registerDefaultInstance(amzh.class, amzhVar);
    }

    private amzh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001!\u000f\u0000\u0003\u000b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\f\u0006᠌\u000e\tည\u0011\nЛ\u000bဇ\u0012\rᐉ\u0004\u000eᐉ\b\u0010ᐉ\u0014\u0014\u001b\u001cᐉ\u0002!ᐉ\u001b", new Object[]{"b", "c", "g", alay.class, "h", "i", "o", "j", amys.n, "k", "l", ajwo.class, "m", "e", "f", "p", "n", ajub.class, "d", "q"});
            case 3:
                return new amzh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzh.class);
            default:
                return null;
        }
    }
}
