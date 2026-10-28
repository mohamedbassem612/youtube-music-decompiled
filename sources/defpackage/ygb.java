package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygb extends aihn implements aiis {
    public static final ygb a;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    private byte g = 2;
    public aigj e = aigj.d;

    static {
        ygb ygbVar = new ygb();
        a = ygbVar;
        aihn.registerDefaultInstance(ygb.class, ygbVar);
    }

    private ygb() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ည\u0000\u0002м\u0000\u0003=\u0000\u0004ဆ\u0001", new Object[]{"d", "c", "b", "e", yfx.class, "f"});
            case 3:
                return new ygb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ygb.class);
            default:
                return null;
        }
    }
}
