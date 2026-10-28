package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arej extends aihi implements aihj {
    public static final arej a;
    private amkt A;
    private ajnn B;
    private areg C;
    private alay D;
    private arek E;
    private areh F;
    private ajwo G;
    private ajwo H;
    private alay I;
    private byte J = 2;
    private int b;
    private int c;
    private ajkl d;
    private ajkl e;
    private alay f;
    private alay g;
    private alay h;
    private arel i;
    private alay k;
    private alay l;
    private arei m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private alay s;
    private alay t;
    private alay u;
    private alay v;
    private alay w;
    private alay x;
    private alay y;
    private alay z;

    static {
        arej arejVar = new arej();
        a = arejVar;
        aihn.registerDefaultInstance(arej.class, arejVar);
    }

    private arej() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.J);
            case 1:
                this.J = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001f\u0000\u0002\u0001:\u001f\u0000\u0000\u001f\u0001ᐉ\u0002\u0002ᐉ\u0004\u0003ᐉ\u0007\u0004ᐉ\u000b\u0005ᐉ\r\u0006ᐉ\n\u0007ᐉ\f\nᐉ\u001d\rᐉ!\u0011ᐉ'\u0012ᐉ\u0006\u0014ᐉ*\u0015ᐉ+\u0016ᐉ\u0005\u001eᐉ\"\u001fᐉ%!ᐉ\u0003\"ᐉ\u0000#ᐉ\u0001%ᐉ\u000f)ᐉ/*ᐉ\b-ᐉ\u001e.ᐉ\u0010/ᐉ\u00122ᐉ\u00173ᐉ\u00134ᐉ\u00185ᐉ\u00198ᐉ2:ᐉ3", new Object[]{"b", "c", "f", "h", "l", "o", "q", "n", "p", "y", "A", "D", "k", "E", "F", "i", "B", "C", "g", "d", "e", "r", "G", "m", "z", "s", "t", "v", "u", "w", "x", "H", "I"});
            case 3:
                return new arej();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arej.class);
            default:
                return null;
        }
    }
}
