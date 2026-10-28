package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvl extends aihi implements aihj {
    public static final alvl a;
    public int b;
    public int c;
    public int d;
    public alvj g;
    public alvk h;
    public boolean i;
    public alvi k;
    public apji l;
    public alvd m;
    public alvc n;
    public boolean o;
    public alvh p;
    public aomc q;
    public alvg r;
    public aigj s;
    public aigj t;
    public aqpo u;
    public String v;
    private apji w;
    private byte x = 2;
    public String e = "";
    public String f = "";

    static {
        alvl alvlVar = new alvl();
        a = alvlVar;
        aihn.registerDefaultInstance(alvl.class, alvlVar);
    }

    private alvl() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.s = aigjVar;
        this.t = aigjVar;
        this.v = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001%\u0014\u0000\u0000\n\u0001᠌\u0000\u0002ဈ\u0002\u0004ဇ\u0007\u0005ဇ\r\bᐉ\u0006\nᐉ\u000f\u000bᐉ\u000b\u0010ᐉ\f\u0011ဉ\u0004\u0012ᐉ\u0013\u0015ᐉ\t\u0016ဈ\u0003\u0018ᐉ\n\u0019ᐉ\u0016\u001fည\u0018 ည\u0019!ᐉ\u001a\"ᐉ\u0010#᠌\u0001%ဈ\u001c", new Object[]{"b", "c", aomi.k, "e", "i", "o", "h", "p", "m", "n", "g", "r", "k", "f", "l", "w", "s", "t", "u", "q", "d", aomi.j, "v"});
            case 3:
                return new alvl();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvl.class);
            default:
                return null;
        }
    }
}
