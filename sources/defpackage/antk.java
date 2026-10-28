package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antk extends aihn implements aiis {
    public static final antk a;
    public int b;
    public aqmh c;
    public alay d;
    public alay e;
    public antj f;
    private byte h = 2;
    public aigj g = aigj.d;

    static {
        antk antkVar = new antk();
        a = antkVar;
        aihn.registerDefaultInstance(antk.class, antkVar);
    }

    private antk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0005\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new antk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(antk.class);
            default:
                return null;
        }
    }
}
