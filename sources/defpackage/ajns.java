package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajns extends aihn implements aiis {
    public static final ajns a;
    private byte A = 2;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private alay h;
    private apji i;
    private ajnt j;
    private alay k;
    private alay l;
    private ajwo m;
    private ajwo n;
    private apji o;
    private ajwo p;
    private ajwo q;
    private ajwo r;
    private ajwo s;
    private ajwo t;
    private ajwo u;
    private ajng v;
    private ajwo w;
    private apji x;
    private apji y;
    private apji z;

    static {
        ajns ajnsVar = new ajns();
        a = ajnsVar;
        aihn.registerDefaultInstance(ajns.class, ajnsVar);
    }

    private ajns() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0007?\u0017\u0000\u0000\u0017\u0007ᐉ\u0006\u0012ᐉ\u0012\u0016ᐉ\u0014\u001cᐉ\u0018\u001dᐉ\u001b\u001eᐉ\u001c\"ᐉ\u001e#ᐉ\u001f$ᐉ %ᐉ\r'ᐉ!(ᐉ\")ᐉ#2ᐉ\u00194ᐉ\u001a5ᐉ\f6ᐉ&8ᐉ'9ᐉ(;ᐉ\u0003=ᐉ\u0015>ᐉ\u000e?ᐉ\u0004", new Object[]{"b", "c", "f", "j", "k", "m", "p", "q", "r", "s", "t", "h", "u", "v", "w", "n", "o", "g", "x", "y", "z", "d", "l", "i", "e"});
            case 3:
                return new ajns();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajns.class);
            default:
                return null;
        }
    }
}
