package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amrd extends aihn implements aiis {
    public static final amrd a;
    public int b;
    public alay d;
    public alja e;
    public int f;
    public int g;
    public int h;
    public aqmh i;
    public int j;
    public int k;
    public ajwo l;
    private amow o;
    private byte p = 2;
    public String c = "";
    public String m = "";
    public aigj n = aigj.d;

    static {
        amrd amrdVar = new amrd();
        a = amrdVar;
        aihn.registerDefaultInstance(amrd.class, amrdVar);
    }

    private amrd() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0005\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0003\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tᐉ\b\nဋ\t\u000bᐉ\u000b\fဈ\f\rဋ\n\u000fည\u000e\u0010ᐉ\u0002", new Object[]{"b", "c", "d", "o", "f", "g", "h", "i", "j", "l", "m", "k", "n", "e"});
            case 3:
                return new amrd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amrd.class);
            default:
                return null;
        }
    }
}
