package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajzb extends aihn implements aiis {
    public static final ajzb a;
    public boolean b;
    private int c;
    private int d;
    private alay e;
    private ajzd f;
    private apji g;
    private apji h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private apji m;
    private apji n;
    private apji o;
    private alay p;
    private apji q;
    private apji r;
    private apji s;
    private apji t;
    private apji u;
    private apji v;
    private ajwo w;
    private byte x = 2;

    static {
        ajzb ajzbVar = new ajzb();
        a = ajzbVar;
        aihn.registerDefaultInstance(ajzb.class, ajzbVar);
    }

    private ajzb() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0002\u0001+\u0014\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\nᐉ\b\u000bᐉ\t\u0010ᐉ\u0010\u0011ᐉ\f\u0012ᐉ\u0011\u0014ᐉ\u0004\u0015ᐉ\n\u0016ᐉ\u000b\u0017ᐉ\u0013\u0018ᐉ\u0014\u001dᐉ\u0016\u001eᐉ\u0017\"ᐉ\u001a#ᐉ\u001b$ᐉ\u001c&ᐉ\u001e)ᐉ\u0003+ဇ!", new Object[]{"c", "d", "e", "f", "i", "j", "n", "m", "o", "h", "k", "l", "p", "q", "r", "s", "t", "u", "v", "w", "g", "b"});
            case 3:
                return new ajzb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzb.class);
            default:
                return null;
        }
    }
}
