package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfe extends aihi implements aihj {
    public static final amfe a;
    public Object c;
    public Object e;
    public Object g;
    public int h;
    public alay i;
    public alay k;
    public ajng l;
    public ajng m;
    public boolean p;
    public aiie q;
    private int r;
    private alay s;
    private ajwo t;
    private amfd u;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    private byte v = 2;
    public aigj n = aigj.d;
    public aiie o = emptyProtobufList();

    static {
        amfe amfeVar = new amfe();
        a = amfeVar;
        aihn.registerDefaultInstance(amfe.class, amfeVar);
    }

    private amfe() {
        emptyProtobufList();
        this.q = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0003\u0001\u0001\u0019\u0012\u0000\u0002\u000b\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005м\u0000\u0007;\u0002\tည\b\nᐉ\u0004\u000bᐉ\t\fЛ\rဇ\n\u000eм\u0001\u000fᐉ\u000b\u0014<\u0002\u0015<\u0001\u0016᠌\u0000\u0018м\u0000\u0019\u001b", new Object[]{"c", "b", "e", "d", "g", "f", "r", "i", "k", "l", "s", aqmh.class, "n", "m", "t", "o", ajwo.class, "p", aqmj.class, "u", amfc.class, amff.class, "h", amed.o, ajjl.class, "q", ajub.class});
            case 3:
                return new amfe();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amfe.class);
            default:
                return null;
        }
    }
}
