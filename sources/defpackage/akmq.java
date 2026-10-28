package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akmq extends aihn implements aiis {
    public static final akmq a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private ajng l;
    private alay m;
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
    private byte x = 2;

    static {
        akmq akmqVar = new akmq();
        a = akmqVar;
        aihn.registerDefaultInstance(akmq.class, akmqVar);
    }

    private akmq() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001$\u0015\u0000\u0000\u0015\u0001ᐉ\u0006\u0002ᐉ\u0007\u0004ᐉ\n\u0006ᐉ\f\u0007ᐉ\r\bᐉ\u0010\fᐉ\u0014\rᐉ\t\u000eᐉ\u0011\u000fᐉ\u0012\u0010ᐉ\u0013\u0013ᐉ\u0015\u0014ᐉ\u0016\u0017ᐉ\u0017\u0018ᐉ\u0018\u001bᐉ\u001b\u001cᐉ\u001c\u001dᐉ\u000e\u001fᐉ\u0001\"ᐉ\u000f$ᐉ\u001d", new Object[]{"b", "d", "e", "g", "h", "i", "l", "p", "f", "m", "n", "o", "q", "r", "s", "t", "u", "v", "j", "c", "k", "w"});
            case 3:
                return new akmq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akmq.class);
            default:
                return null;
        }
    }
}
