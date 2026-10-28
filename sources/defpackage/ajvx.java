package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajvx extends aihn implements aiis {
    public static final ajvx a;
    public int b;
    public aqmh c;
    public ajvy d;
    public aiua g;
    public aiie h;
    public boolean i;
    public boolean j;
    private ajvw k;
    private apji l;
    private apji m;
    private amkj n;
    private byte o = 2;
    public aiie e = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        ajvx ajvxVar = new ajvx();
        a = ajvxVar;
        aihn.registerDefaultInstance(ajvx.class, ajvxVar);
    }

    private ajvx() {
        emptyProtobufList();
        this.h = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0006ည\u0005\tဉ\u0007\f\u001b\rဇ\n\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\r\u0011ဇ\u000e", new Object[]{"b", "c", "d", "k", "e", aitj.class, "f", "g", "h", aitj.class, "i", "l", "m", "n", "j"});
            case 3:
                return new ajvx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvx.class);
            default:
                return null;
        }
    }
}
