package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class airb extends aihn implements aiis {
    public static final airb a;
    public int b;
    public int c;
    public alay d;
    public alay e;
    public alay f;
    public aqmh g;
    public apji h;
    public boolean i;
    public boolean j;
    public ajwo k;
    public int l;
    public ajue m;
    public boolean n;
    public int o;
    public boolean p;
    public aqmh q;
    private alay r;
    private alay s;
    private airl t;
    private alay u;
    private apji v;
    private aiqz w;
    private byte x = 2;

    static {
        airb airbVar = new airb();
        a = airbVar;
        aihn.registerDefaultInstance(airb.class, airbVar);
    }

    private airb() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0002\u0004(\u0014\u0000\u0000\r\u0004ᐉ\u0002\u0005ᐉ \u0006ᐉ\u0007\u0007ဇ\t\bဇ\n\tᐉ!\fᐉ\u000b\rᐉ\u0005\u000fᐉ\r\u0010᠌\u000e\u0011ᐉ\u000f\u0013ᐉ\b\u0015ᐉ\u0012\u0016ဉ\u0013\u0019ᐉ\u0003\u001aᐉ\u0004 ဇ\u0018#ᐉ\u0019%᠌\u001b(ဇ\u001d", new Object[]{"b", "c", "d", "w", "g", "i", "j", "q", "k", "f", "s", "l", akvb.u, "t", "h", "u", "m", "r", "e", "n", "v", "o", aiod.m, "p"});
            case 3:
                return new airb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airb.class);
            default:
                return null;
        }
    }
}
