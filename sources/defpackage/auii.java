package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auii extends aihn implements aiis {
    public static final auii a;
    public int b;
    public auin d;
    public auev e;
    public ajwo g;
    public float h;
    public int i;
    public ajwo k;
    public auhu l;
    public auin m;
    public ajai o;
    private byte p = 2;
    public String c = "";
    public String f = "";
    public String j = "";
    public String n = "";

    static {
        auii auiiVar = new auii();
        a = auiiVar;
        aihn.registerDefaultInstance(auii.class, auiiVar);
    }

    private auii() {
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ခ\u0005\u0007င\u0006\bဈ\u0007\tᐉ\b\nᐉ\t\u000bဉ\n\fဈ\u000b\rဉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new auii();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auii.class);
            default:
                return null;
        }
    }
}
