package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apun extends aihi implements aihj {
    public static final apun a;
    private ajwo A;
    private apum B;
    private alcj C;
    private alay D;
    public int b;
    public Object d;
    public aqjn f;
    public apji g;
    public apji h;
    public boolean i;
    public ajwo k;
    public apup l;
    public int m;
    public akrq n;
    private int o;
    private alay p;
    private alay q;
    private alay r;
    private alay s;
    private apug t;
    private ajwo u;
    private apul v;
    private apji w;
    private aqen x;
    private apuo y;
    private apuk z;
    public int c = 0;
    private byte E = 2;
    public String e = "";

    static {
        apun apunVar = new apun();
        a = apunVar;
        aihn.registerDefaultInstance(apun.class, apunVar);
    }

    private apun() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001c\u0001\u0002\u00017\u001c\u0000\u0000\u0014\u0001ᐉ\u0002\u0003ᐉ\u0010\u0004ᐉ\u0011\u0005ᐉ\u0018\u0006ᐉ\u0014\tᐉ\b\fᐉ\u0003\u000eᐉ\u0007\u0011ᐉ\u001b\u0013ᐉ\u0017\u0017ဇ\r\u0018ᐉ \u0019ᐉ!\u001dᐉ\u0015\u001eᐉ\u000f\u001fᐉ\u0012$ᐉ\u0005'ᐉ\u0013)ဉ(+᠌\u0019->\u0000.>\u00000<\u00001ဈ\u00002ᐉ\u00064ဉ\u00016м\u00007ᐉ*", new Object[]{"d", "c", "b", "o", "p", "k", "u", "l", "x", "s", "q", "r", "A", "z", "i", "B", "C", "y", "t", "v", "g", "w", "n", "m", apsb.g, apur.class, "e", "h", "f", amjx.class, "D"});
            case 3:
                return new apun();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apun.class);
            default:
                return null;
        }
    }
}
