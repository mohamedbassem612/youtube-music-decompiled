package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmx extends aihn implements aiis {
    public static final aqmx a;
    public int b;
    public int c;
    public akel f;
    private byte g = 2;
    public String d = "";
    public aigj e = aigj.d;

    static {
        aqmx aqmxVar = new aqmx();
        a = aqmxVar;
        aihn.registerDefaultInstance(aqmx.class, aqmxVar);
    }

    private aqmx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ည\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqmx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmx.class);
            default:
                return null;
        }
    }
}
