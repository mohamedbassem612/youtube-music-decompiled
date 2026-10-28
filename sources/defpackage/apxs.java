package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxs extends aihn implements aiis {
    public static final apxs a;
    public static final aihl b;
    public int c;
    public Object e;
    public apxr f;
    public boolean h;
    public akuf i;
    public boolean j;
    public boolean k;
    public ajwo l;
    public akum m;
    public apxq n;
    public aoli o;
    private ajwo q;
    public int d = 0;
    private byte r = 2;
    public String g = "";
    public aigj p = aigj.d;

    static {
        apxs apxsVar = new apxs();
        a = apxsVar;
        aihn.registerDefaultInstance(apxs.class, apxsVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apxsVar, apxsVar, null, 138681778, aika.MESSAGE, apxs.class);
    }

    private apxs() {
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
                return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001\u0011\u000e\u0000\u0000\u0007\u0001;\u0000\u0002ᐉ\u0003\u0003ဈ\u0001\u0005ဇ\u0002\u0006ဇ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\n<\u0000\u000bᐉ\u0000\rᐉ\n\u000eည\u000b\u0010ဇ\u0005\u0011ᐉ\r", new Object[]{"e", "d", "c", "i", "g", "h", "j", "l", "m", "n", akud.class, "f", "o", "p", "k", "q"});
            case 3:
                return new apxs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxs.class);
            default:
                return null;
        }
    }
}
