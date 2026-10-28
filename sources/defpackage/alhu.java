package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alhu extends aihn implements aiis {
    public static final alhu a;
    public int b;
    public Object d;
    public alja e;
    public alay f;
    public ajwo g;
    public int c = 0;
    private byte i = 2;
    public aigj h = aigj.d;

    static {
        alhu alhuVar = new alhu();
        a = alhuVar;
        aihn.registerDefaultInstance(alhu.class, alhuVar);
    }

    private alhu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0006\u0006м\u0000\u0007м\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", ajng.class, ajwo.class});
            case 3:
                return new alhu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhu.class);
            default:
                return null;
        }
    }
}
