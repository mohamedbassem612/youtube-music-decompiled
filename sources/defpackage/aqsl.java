package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsl extends aihn implements aiis {
    public static final aqsl a;
    public int b;
    public alja d;
    public ajwo e;
    public alay f;
    public long g;
    public aqmh h;
    public alay i;
    public ajng j;
    private byte k = 2;
    public String c = "";

    static {
        aqsl aqslVar = new aqsl();
        a = aqslVar;
        aihn.registerDefaultInstance(aqsl.class, aqslVar);
    }

    private aqsl() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqsl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsl.class);
            default:
                return null;
        }
    }
}
