package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almd extends aihi implements aihj {
    public static final almd a;
    private ajwo A;
    private ajwo B;
    private byte C = 2;
    public int b;
    public alop c;
    public allx d;
    public allz e;
    public alme f;
    public almf g;
    public alma h;
    public apjh i;
    public aigj k;
    public aiie l;
    public aiie m;
    public aiie n;
    public int o;
    public int p;
    public apji q;
    public aiie r;
    public apji s;
    private int t;
    private apji u;
    private ally v;
    private ajwo w;
    private ajwo x;
    private ajwo y;
    private albe z;

    static {
        almd almdVar = new almd();
        a = almdVar;
        aihn.registerDefaultInstance(almd.class, almdVar);
    }

    private almd() {
        emptyProtobufList();
        this.k = aigj.d;
        this.l = emptyProtobufList();
        emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.r = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0001̉\u0018\u0000\u0004\u0015\u0001ᐉ\u0000\tᐉ\u0006\nᐉ\t\fᐉ\u0005\rᐉ\u0001\u000fᐉ\u0004\u0010ည\f\u0012ᐉ\u0007\u0014ᐉ\b\u001dЛ\u001eЛ\"ဋ\u001c#ဋ\u001d$ᐉ\u0018%ᐉ\u001e&ᐉ\u0017'ᐉ\u0003(Л*ᐉ\u001a+ᐉ ,Л-ᐉ!4ᐉ\"̉ᐉ\u001f", new Object[]{"b", "t", "c", "f", "i", "v", "d", "e", "k", "g", "h", "m", ajwo.class, "n", ajwo.class, "o", "p", "x", "q", "w", "u", "l", apji.class, "y", "s", "r", apji.class, "A", "B", "z"});
            case 3:
                return new almd();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almd.class);
            default:
                return null;
        }
    }
}
