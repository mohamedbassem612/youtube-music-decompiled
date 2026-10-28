package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoun extends aihi implements aihj {
    public static final aoun a;
    private alay A;
    private ajkl B;
    private ajkl C;
    private ajwo D;
    private apji E;
    private alay F;
    private apji G;
    private byte H = 2;
    public int b;
    public int c;
    public alay d;
    public alay e;
    public alay f;
    public aqmh g;
    public alay h;
    public alay i;
    public boolean k;
    public ajwo l;
    public alay m;
    public String n;
    public aiie o;
    public angb p;
    public ajwo q;
    public ajwo r;
    public String s;
    public aigj t;
    public aoum u;
    public String v;
    public aoue w;
    public int x;
    public aoup y;
    private alay z;

    static {
        aoun aounVar = new aoun();
        a = aounVar;
        aihn.registerDefaultInstance(aoun.class, aounVar);
    }

    private aoun() {
        emptyProtobufList();
        this.n = "";
        this.o = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.s = "";
        this.t = aigj.d;
        emptyProtobufList();
        this.v = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.H);
            case 1:
                this.H = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001d\u0000\u0002\u0001.\u001d\u0000\u0001\u0016\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ဇ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\u000b\nဈ\f\fᐉ\u0002\rЛ\u000eᐉ\u0016\u000fည\u0015\u0012ᐉ\n\u0013ᐉ\u000f\u0014ᐉ\r\u0015ᐉ\u000e\u001aဈ\u0013\u001eᐉ\u001b\u001fᐉ\u001c%ဈ!&ᐉ\u0010(ᐉ\u0012)ᐉ#*᠌$,ᐉ\u001d-ဉ&.ᐉ\u0011", new Object[]{"b", "c", "d", "e", "g", "h", "i", "k", "l", "z", "m", "n", "f", "o", ajkc.class, "u", "t", "A", "p", "B", "C", "s", "E", "F", "v", "D", "r", "w", "x", aobi.m, "G", "y", "q"});
            case 3:
                return new aoun();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoun.class);
            default:
                return null;
        }
    }
}
