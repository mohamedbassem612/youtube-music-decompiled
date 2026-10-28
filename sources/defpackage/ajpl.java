package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajpl extends aihn implements aiis {
    public static final ajpl a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajpn g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private ajpo m;
    private ajpk n;
    private ajwo o;
    private ajpm p;
    private ajwo q;
    private byte r = 2;

    static {
        ajpl ajplVar = new ajpl();
        a = ajplVar;
        aihn.registerDefaultInstance(ajpl.class, ajplVar);
    }

    private ajpl() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u001f\u000f\u0000\u0000\u000f\u0001ᐉ\u0002\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\n\bᐉ\f\nᐉ\r\fᐉ\u000e\u0012ᐉ\u0013\u0013ᐉ\u0000\u0015ᐉ\u0005\u0016ᐉ\u0006\u0018ᐉ\u0003\u001cᐉ\t\u001eᐉ\u0014\u001fᐉ\u000b", new Object[]{"b", "d", "h", "i", "k", "m", "n", "o", "p", "c", "f", "g", "e", "j", "q", "l"});
            case 3:
                return new ajpl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajpl.class);
            default:
                return null;
        }
    }
}
