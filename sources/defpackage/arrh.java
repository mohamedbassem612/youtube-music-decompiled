package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arrh extends aihn implements aiis {
    public static final arrh a;
    public alay b;
    public alay c;
    private int e;
    private apji f;
    private byte g = 2;
    public aigj d = aigj.d;

    static {
        arrh arrhVar = new arrh();
        a = arrhVar;
        aihn.registerDefaultInstance(arrh.class, arrhVar);
    }

    private arrh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0003\u0006ᐉ\u0005", new Object[]{"e", "b", "c", "d", "f"});
            case 3:
                return new arrh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arrh.class);
            default:
                return null;
        }
    }
}
