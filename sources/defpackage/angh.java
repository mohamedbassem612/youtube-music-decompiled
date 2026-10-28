package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class angh extends aihn implements aiis {
    public static final angh a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public alja f;
    public ajwo g;
    public alay h;
    public alay i;
    public alay j;
    public alja k;
    public ajwo l;
    public boolean m;
    public boolean p;
    private byte q = 2;
    public aigj n = aigj.d;
    public String o = "";

    static {
        angh anghVar = new angh();
        a = anghVar;
        aihn.registerDefaultInstance(angh.class, anghVar);
    }

    private angh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0006ᐉ\t\bည\r\u000bဇ\n\fᐉ\u0001\rᐉ\u0006\u0012ဈ\u0011\u0015ᐉ\u0002\u0016ᐉ\u0007\u0017ဇ\u0013", new Object[]{"b", "c", "f", "g", "h", "k", "l", "n", "m", "d", "i", "o", "e", "j", "p"});
            case 3:
                return new angh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angh.class);
            default:
                return null;
        }
    }
}
