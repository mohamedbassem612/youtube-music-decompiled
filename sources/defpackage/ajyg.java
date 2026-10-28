package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyg extends aihn implements aiis {
    public static final ajyg a;
    public int b;
    public alay d;
    public boolean f;
    public alay g;
    public int h;
    public ajwo i;
    public boolean j;
    public int k;
    private byte l = 2;
    public String c = "";
    public String e = "";

    static {
        ajyg ajygVar = new ajyg();
        a = ajygVar;
        aihn.registerDefaultInstance(ajyg.class, ajygVar);
    }

    private ajyg() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007ᐉ\u0006\bဇ\u0007\t᠌\b", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i", "j", "k", akkx.p});
            case 3:
                return new ajyg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyg.class);
            default:
                return null;
        }
    }
}
