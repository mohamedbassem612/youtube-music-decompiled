package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajpg extends aihn implements aiis {
    public static final ajpg a;
    private alay A;
    private byte B = 2;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajpn k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private ajpo r;
    private ajpk s;
    private ajwo t;
    private alay u;
    private ajph v;
    private alay w;
    private alay x;
    private ajpm y;
    private ajwo z;

    static {
        ajpg ajpgVar = new ajpg();
        a = ajpgVar;
        aihn.registerDefaultInstance(ajpg.class, ajpgVar);
    }

    private ajpg() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001)\u0019\u0000\u0000\u0019\u0001ᐉ\u0004\u0004ᐉ\u000e\u0005ᐉ\u000f\u0006ᐉ\u0010\bᐉ\u0012\nᐉ\u0013\fᐉ\u0014\u0012ᐉ\u001d\u0013ᐉ\u0000\u0015ᐉ\n\u0016ᐉ\u000b\u0018ᐉ\u0019\u0019ᐉ\u001a\u001aᐉ\u0003\u001bᐉ\u0016\u001cᐉ\f\u001dᐉ\r\u001eᐉ\t\u001fᐉ\u0006 ᐉ\u0005%ᐉ\u0007&ᐉ\u001b'ᐉ\u001e(ᐉ\u001f)ᐉ\u0011", new Object[]{"b", "e", "n", "o", "p", "r", "s", "t", "y", "c", "j", "k", "v", "w", "d", "u", "l", "m", "i", "g", "f", "h", "x", "z", "A", "q"});
            case 3:
                return new ajpg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajpg.class);
            default:
                return null;
        }
    }
}
