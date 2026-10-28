package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ambn extends aihn implements aiis {
    public static final ambn a;
    public int b;
    public apji c;
    public apji d;
    public apji e;
    public apji f;
    public apji g;
    public apji h;
    public apji i;
    public apji j;
    public apji k;
    public aiua m;
    public apji n;
    public int o;
    public apji p;
    private apji q;
    private apji r;
    private apji s;
    private apji t;
    private apji u;
    private apji v;
    private apji w;
    private apji x;
    private byte y = 2;
    public aigj l = aigj.d;

    static {
        ambn ambnVar = new ambn();
        a = ambnVar;
        aihn.registerDefaultInstance(ambn.class, ambnVar);
    }

    private ambn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0001\u0001\u001f\u0016\u0000\u0000\u0013\u0001ᐉ\u0000\u0003ည\u000f\u0004ᐉ\u0001\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\n\tᐉ\u0003\nᐉ\r\u000bᐉ\u000e\rᐉ\u000b\u000eဉ\u0011\u0010ᐉ\u0002\u0011ᐉ\u0013\u0012ᐉ\u0015\u0016ᐉ\u0004\u0017ᐉ\u0019\u0019င\u001b\u001aᐉ\u0005\u001bᐉ\u0006\u001cᐉ\u0014\u001eᐉ\t\u001fᐉ\u001d", new Object[]{"b", "c", "l", "d", "r", "i", "t", "e", "k", "u", "j", "m", "q", "v", "w", "f", "x", "o", "g", "h", "n", "s", "p"});
            case 3:
                return new ambn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambn.class);
            default:
                return null;
        }
    }
}
