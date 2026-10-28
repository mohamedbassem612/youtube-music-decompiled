package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aobt extends aihn implements aiis {
    public static final aobt a;
    private int b;
    private aovv c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private ajwo j;
    private alay k;
    private alay l;
    private byte m = 2;

    static {
        aobt aobtVar = new aobt();
        a = aobtVar;
        aihn.registerDefaultInstance(aobt.class, aobtVar);
    }

    private aobt() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u000f\n\u0000\u0000\n\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\n\rᐉ\u000b\u000eᐉ\u0001\u000fᐉ\u0004", new Object[]{"b", "d", "f", "g", "h", "i", "j", "k", "l", "c", "e"});
            case 3:
                return new aobt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobt.class);
            default:
                return null;
        }
    }
}
