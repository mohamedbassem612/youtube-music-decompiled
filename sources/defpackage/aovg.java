package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aovg extends aihn implements aiis {
    public static final aovg a;
    public int b;
    public aova c;
    public aovb d;
    public alay e;
    public aove f;
    public alay g;
    public aove h;
    public aove i;
    public boolean j;
    public alay k;
    private alay l;
    private aovh m;
    private aovb n;
    private alay o;
    private aovj p;
    private ajwo q;
    private byte r = 2;

    static {
        aovg aovgVar = new aovg();
        a = aovgVar;
        aihn.registerDefaultInstance(aovg.class, aovgVar);
    }

    private aovg() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fဇ\f\rᐉ\n\u000eᐉ\r\u0010ᐉ\u000f", new Object[]{"b", "l", "c", "d", "n", "o", "m", "p", "e", "f", "g", "i", "j", "h", "k", "q"});
            case 3:
                return new aovg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovg.class);
            default:
                return null;
        }
    }
}
