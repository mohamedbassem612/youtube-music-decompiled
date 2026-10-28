package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aodv extends aihn implements aiis {
    public static final aodv a;
    public int b;
    public aqmh d;
    public boolean f;
    public aodu g;
    private alay h;
    private byte i = 2;
    public String c = "";
    public String e = "";

    static {
        aodv aodvVar = new aodv();
        a = aodvVar;
        aihn.registerDefaultInstance(aodv.class, aodvVar);
    }

    private aodv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0004\u0005ᐉ\u0003\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new aodv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aodv.class);
            default:
                return null;
        }
    }
}
