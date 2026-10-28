package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alhj extends aihn implements aiis {
    public static final alhj a;
    public int b;
    public Object d;
    public boolean e;
    public alay f;
    public alay g;
    public aigj h;
    public aiqd i;
    public float j;
    public alhi k;
    public alhi l;
    public int c = 0;
    private byte m = 2;

    static {
        alhj alhjVar = new alhj();
        a = alhjVar;
        aihn.registerDefaultInstance(alhj.class, alhjVar);
    }

    private alhj() {
        emptyProtobufList();
        this.h = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0004\u0001ᐉ\u0001\u0003ည\u0006\u0004ဉ\u0007\u0005ᐉ\u0002\u0006ခ\b\u0007ᐉ\t\bᐉ\n\tဇ\u0000\u000b\u083f\u0000\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", "f", "h", "i", "g", "j", "k", "l", "e", albk.r, ajkx.class, aqle.class});
            case 3:
                return new alhj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhj.class);
            default:
                return null;
        }
    }
}
