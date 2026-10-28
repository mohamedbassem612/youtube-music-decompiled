package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amet extends aihn implements aiis {
    public static final amet a;
    private int b;
    private ajng c;
    private ajng d;
    private amev e;
    private aodl f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private byte k = 2;

    static {
        amet ametVar = new amet();
        a = ametVar;
        aihn.registerDefaultInstance(amet.class, ametVar);
    }

    private amet() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u0016\b\u0000\u0000\b\u0002ᐉ\u0002\u0003ᐉ\u0003\u0006ᐉ\u0007\bᐉ\b\u0011ᐉ\r\u0012ᐉ\u000e\u0015ᐉ\u0011\u0016ᐉ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new amet();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amet.class);
            default:
                return null;
        }
    }
}
