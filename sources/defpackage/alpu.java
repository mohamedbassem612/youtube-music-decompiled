package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alpu extends aihn implements aiis {
    public static final alpu a;
    public Object c;
    public alop d;
    private int e;
    public int b = 0;
    private byte f = 2;

    static {
        alpu alpuVar = new alpu();
        a = alpuVar;
        aihn.registerDefaultInstance(alpu.class, alpuVar);
    }

    private alpu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003м\u0000\u0004м\u0000", new Object[]{"c", "b", "e", "d", ajwo.class, ajwo.class});
            case 3:
                return new alpu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpu.class);
            default:
                return null;
        }
    }
}
