package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampq extends aihn implements aiis {
    public static final ampq a;
    private apji A;
    private apji B;
    private apji C;
    private apji D;
    private apji E;
    private ampp F;
    public int b;
    public Object d;
    public long f;
    public alay h;
    public aqmh i;
    public akji j;
    public alay k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public ajwo q;
    public apji r;
    private int s;
    private alay t;
    private alay u;
    private alay v;
    private apji w;
    private apji x;
    private apji y;
    private apji z;
    public int c = 0;
    private byte G = 2;
    public String e = "";
    public String g = "";

    static {
        ampq ampqVar = new ampq();
        a = ampqVar;
        aihn.registerDefaultInstance(ampq.class, ampqVar);
    }

    private ampq() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.G);
            case 1:
                this.G = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001e\u0001\u0002\u0001,\u001e\u0000\u0000\u0015\u0001ဈ\u0000\u0002ဃ\u0001\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0006:\u0000\u0007м\u0000\bм\u0000\tဋ\n\nဋ\u000b\u000bဋ\f\fဋ\r\rဈ\u0003\u000eဋ\t\u000fᐉ\u0012\u0012ᐉ\u0010\u0013ᐉ\u0011\u0016ᐉ\u0002\u0017ᐉ\u0016\u001cᐉ \u001dᐉ\u0014\u001eᐉ\u0015\u001fᐉ\u0006#ᐉ\u0017$ᐉ\u0018%ᐉ\u0019)ᐉ\u001a*ᐉ\u001b+ᐉ\u001c,ᐉ\u001d", new Object[]{"d", "c", "b", "s", "e", "f", "h", "i", "k", alay.class, ampo.class, "m", "n", "o", "p", "g", "l", "q", "u", "v", "t", "r", "F", "w", "x", "j", "y", "z", "A", "B", "C", "D", "E"});
            case 3:
                return new ampq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampq.class);
            default:
                return null;
        }
    }
}
