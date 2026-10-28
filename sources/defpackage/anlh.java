package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anlh extends aihn implements aiis {
    public static final anlh a;
    public alay b;
    public apji d;
    private int e;
    private alay f;
    private alay g;
    private ajwo h;
    private byte i = 2;
    public aigj c = aigj.d;

    static {
        anlh anlhVar = new anlh();
        a = anlhVar;
        aihn.registerDefaultInstance(anlh.class, anlhVar);
    }

    private anlh() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0002", new Object[]{"e", "b", "f", "c", "d", "h", "g"});
            case 3:
                return new anlh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anlh.class);
            default:
                return null;
        }
    }
}
