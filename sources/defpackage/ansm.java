package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ansm extends aihn implements aiis {
    public static final ansm a;
    public int b;
    public Object d;
    public alay e;
    public ajwo f;
    public int c = 0;
    private byte h = 2;
    public aigj g = aigj.d;

    static {
        ansm ansmVar = new ansm();
        a = ansmVar;
        aihn.registerDefaultInstance(ansm.class, ansmVar);
    }

    private ansm() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002<\u0000\u0003<\u0000\u0004ᐉ\u0001\u0006ည\u0003\u0007м\u0000", new Object[]{"d", "c", "b", "e", ansn.class, ansl.class, "f", "g", ansk.class});
            case 3:
                return new ansm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ansm.class);
            default:
                return null;
        }
    }
}
