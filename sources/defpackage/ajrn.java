package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajrn extends aihn implements aiis {
    public static final ajrn a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private aqev k;
    private ajkl l;
    private alay m;
    private ajap n;
    private alay o;
    private apji p;
    private apji q;
    private alay r;
    private alay s;
    private alay t;
    private byte u = 2;

    static {
        ajrn ajrnVar = new ajrn();
        a = ajrnVar;
        aihn.registerDefaultInstance(ajrn.class, ajrnVar);
    }

    private ajrn() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002#\u0012\u0000\u0000\u0012\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\nᐉ\n\fᐉ\f\rᐉ\r\u000eᐉ\u000e\u0013ᐉ\u0007\u0015ᐉ\u000b\u0019ᐉ\u001a\u001aᐉ\u001b\u001eᐉ\u0016 ᐉ\u0003!ᐉ\u0010#ᐉ\u0011", new Object[]{"b", "c", "d", "f", "g", "i", "j", "k", "m", "n", "o", "h", "l", "s", "t", "r", "e", "p", "q"});
            case 3:
                return new ajrn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrn.class);
            default:
                return null;
        }
    }
}
