package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqjv extends aihn implements aiis {
    public static final aqjv a;
    public int b;
    public alay d;
    public aqjw e;
    private byte i = 2;
    public String c = "";
    public String f = "";
    public String g = "";
    public aigj h = aigj.d;

    static {
        aqjv aqjvVar = new aqjv();
        a = aqjvVar;
        aihn.registerDefaultInstance(aqjv.class, aqjvVar);
    }

    private aqjv() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0006ည\u0006\u0007ဈ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "c"});
            case 3:
                return new aqjv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjv.class);
            default:
                return null;
        }
    }
}
