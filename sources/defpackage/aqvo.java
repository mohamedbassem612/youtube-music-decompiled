package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvo extends aihn implements aiis {
    public static final aqvo a;
    private int b;
    private alay c;
    private ajng d;
    private alay e;
    private alay f;
    private alay g;
    private ajng h;
    private ajng i;
    private aqvn j;
    private byte k = 2;

    static {
        aqvo aqvoVar = new aqvo();
        a = aqvoVar;
        aihn.registerDefaultInstance(aqvo.class, aqvoVar);
    }

    private aqvo() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\n\b\u0000\u0000\b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqvo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvo.class);
            default:
                return null;
        }
    }
}
