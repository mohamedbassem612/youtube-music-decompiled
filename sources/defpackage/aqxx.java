package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxx extends aihn implements aiis {
    public static final aqxx a;
    private int b;
    private aqxy c;
    private aqxy d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo j;
    private apji k;
    private aqxy l;
    private aqxy m;
    private byte n = 2;

    static {
        aqxx aqxxVar = new aqxx();
        a = aqxxVar;
        aihn.registerDefaultInstance(aqxx.class, aqxxVar);
    }

    private aqxx() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u000f\u0002ᐉ\u0010\u0003ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\u000b\tᐉ\u0000\nᐉ\u0001\rᐉ\u0005\u000eᐉ\u0006\u0010ᐉ\f", new Object[]{"b", "l", "m", "e", "h", "i", "j", "c", "d", "f", "g", "k"});
            case 3:
                return new aqxx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxx.class);
            default:
                return null;
        }
    }
}
