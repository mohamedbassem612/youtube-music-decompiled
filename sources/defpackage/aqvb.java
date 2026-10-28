package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvb extends aihn implements aiis {
    public static final aqvb a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajwo f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private apji l;
    private alay m;
    private alay n;
    private alay o;
    private alay p;
    private alay q;
    private alay r;
    private alay s;
    private ajng t;
    private ajng u;
    private byte v = 2;

    static {
        aqvb aqvbVar = new aqvb();
        a = aqvbVar;
        aihn.registerDefaultInstance(aqvb.class, aqvbVar);
    }

    private aqvb() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\u0014\u000bᐉ\u0015\u000eᐉ\u0013\u000fᐉ\u000b\u0010ᐉ\r\u0011ᐉ\f\u0012ᐉ\u000e\u0013ᐉ\u000f\u0014ᐉ\u0010\u0016ᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "t", "u", "s", "m", "o", "n", "p", "q", "r", "l"});
            case 3:
                return new aqvb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvb.class);
            default:
                return null;
        }
    }
}
