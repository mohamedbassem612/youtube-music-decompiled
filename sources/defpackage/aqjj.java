package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqjj extends aihn implements aiis {
    public static final aqjj a;
    public int b;
    public ajwo d;
    public boolean f;
    public boolean g;
    public alja h;
    public aqjg i;
    public apmo l;
    private apji m;
    private aqjh n;
    private aqji o;
    private byte p = 2;
    public String c = "";
    public String e = "";
    public String j = "";
    public aigj k = aigj.d;

    static {
        aqjj aqjjVar = new aqjj();
        a = aqjjVar;
        aihn.registerDefaultInstance(aqjj.class, aqjjVar);
    }

    private aqjj() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u001b\r\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဇ\u0004\u0004ᐉ\u000e\u0006ᐉ\u0006\u0007ᐉ\f\nᐉ\u0010\u000bဈ\u0000\u000eည\u0014\u0010ဈ\u000f\u0014ဇ\u0005\u0015ဉ\u0015\u001bᐉ\u0003", new Object[]{"b", "d", "e", "f", "i", "h", "n", "o", "c", "k", "j", "g", "l", "m"});
            case 3:
                return new aqjj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjj.class);
            default:
                return null;
        }
    }
}
