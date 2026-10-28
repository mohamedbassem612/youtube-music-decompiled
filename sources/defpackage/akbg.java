package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbg extends aihn implements aiis {
    public static final akbg a;
    public int b;
    public Object d;
    public alja e;
    public aqmh f;
    public alay g;
    public alay h;
    private apji j;
    private aqma k;
    private aqma l;
    private alay m;
    private alay n;
    private ajwo o;
    private ajwo p;
    private apji q;
    public int c = 0;
    private byte r = 2;
    public aigj i = aigj.d;

    static {
        akbg akbgVar = new akbg();
        a = akbgVar;
        aihn.registerDefaultInstance(akbg.class, akbgVar);
    }

    private akbg() {
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001#\u000f\u0000\u0000\u000e\u0001ᐉ\u0001\u0002ᐉ\u0006\u0003ᐉ\u000b\u0004м\u0000\u0006ည\u0016\tм\u0000\rᐉ\f\u0012ᐉ\u0005\u0013ᐉ\u0010\u0014ᐉ\u0011\u0018ᐉ\u000e\u001cᐉ\r\u001dᐉ\t\u001eᐉ\n#ᐉ\u001c", new Object[]{"d", "c", "b", "e", "f", "g", ajwo.class, "i", ajwo.class, "h", "j", "o", "p", "n", "m", "k", "l", "q"});
            case 3:
                return new akbg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbg.class);
            default:
                return null;
        }
    }
}
