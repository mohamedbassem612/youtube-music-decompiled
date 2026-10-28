package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqof extends aihn implements aiis {
    public static final aqof a;
    public int b;
    public alay c;
    public alay d;
    public float e;
    public aqoc f;
    public aqoe g;
    public apji h;
    public apji i;
    public apji j;
    public aozn k;
    public aqob m;
    public boolean n;
    public long o;
    public ajwo q;
    public aqod s;
    private byte t = 2;
    public String l = "";
    public aigj p = aigj.d;
    public String r = "";

    static {
        aqof aqofVar = new aqof();
        a = aqofVar;
        aihn.registerDefaultInstance(aqof.class, aqofVar);
    }

    private aqof() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0000\u0007\u0001ᐉ\b\u0002ဈ\t\u0003ᐉ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ခ\u0002\bဉ\u0003\tဉ\u0004\nဉ\n\u000bဂ\f\fည\u000e\u000fᐉ\u0010\u0013ᐉ\u0007\u0014ဈ\u0013\u0016ဇ\u000b\u0017ဉ\u0015", new Object[]{"b", "k", "l", "c", "d", "h", "i", "e", "f", "g", "m", "o", "p", "q", "j", "r", "n", "s"});
            case 3:
                return new aqof();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqof.class);
            default:
                return null;
        }
    }
}
