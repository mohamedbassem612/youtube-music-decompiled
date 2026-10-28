package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajxx extends aihn implements aiis {
    public static final ajxx a;
    public int b;
    public alay c;
    public alay d;
    public aqmh e;
    public ajng f;
    public ajng g;
    public apji h;
    public apji k;
    public boolean l;
    private ajng m;
    private alay n;
    private byte o = 2;
    public String i = "";
    public String j = "";

    static {
        ajxx ajxxVar = new ajxx();
        a = ajxxVar;
        aihn.registerDefaultInstance(ajxx.class, ajxxVar);
    }

    private ajxx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\u000bဈ\b\fᐉ\n\rဇ\u000b\u000eဈ\t", new Object[]{"b", "c", "e", "f", "m", "d", "n", "g", "h", "i", "k", "l", "j"});
            case 3:
                return new ajxx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajxx.class);
            default:
                return null;
        }
    }
}
