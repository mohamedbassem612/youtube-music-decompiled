package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anzx extends aihn implements aiis {
    public static final anzx a;
    public int b;
    public alay c;
    public apji d;
    public apji e;
    public apji f;
    public apji h;
    public apji i;
    public apji j;
    public apji k;
    public apji l;
    public alay m;
    public boolean n;
    private ajwo o;
    private byte p = 2;
    public aigj g = aigj.d;

    static {
        anzx anzxVar = new anzx();
        a = anzxVar;
        aihn.registerDefaultInstance(anzx.class, anzxVar);
    }

    private anzx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\n\tᐉ\u000b\nᐉ\u0003\u000bᐉ\b\fᐉ\t\rᐉ\f\u000eဇ\r", new Object[]{"b", "c", "d", "e", "g", "h", "i", "o", "l", "f", "j", "k", "m", "n"});
            case 3:
                return new anzx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzx.class);
            default:
                return null;
        }
    }
}
