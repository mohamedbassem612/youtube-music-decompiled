package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class antc extends aihn implements aiis {
    public static final antc a;
    public int b;
    public Object d;
    public ajwo e;
    private ajwo f;
    public int c = 0;
    private byte g = 2;

    static {
        antc antcVar = new antc();
        a = antcVar;
        aihn.registerDefaultInstance(antc.class, antcVar);
    }

    private antc() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001м\u0000\u0002м\u0000\u0003ᐉ\u0000\u0004ᐉ\u0001", new Object[]{"d", "c", "b", apji.class, ajwo.class, "e", "f"});
            case 3:
                return new antc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(antc.class);
            default:
                return null;
        }
    }
}
