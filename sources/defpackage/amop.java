package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amop extends aihn implements aiis {
    public static final amop a;
    public int b;
    public alja d;
    public aiqe f;
    public boolean g;
    public ajwo j;
    private ajwo k;
    private byte l = 2;
    public String c = "";
    public String e = "";
    public String h = "";
    public aigj i = aigj.d;

    static {
        amop amopVar = new amop();
        a = amopVar;
        aihn.registerDefaultInstance(amop.class, amopVar);
    }

    private amop() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0005ဇ\u0005\bည\t\tဈ\u0007\nᐉ\n\u000bᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "k", "j"});
            case 3:
                return new amop();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amop.class);
            default:
                return null;
        }
    }
}
