package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajfq extends aihn implements aiis {
    public static final ajfq a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        ajfq ajfqVar = new ajfq();
        a = ajfqVar;
        aihn.registerDefaultInstance(ajfq.class, ajfqVar);
    }

    private ajfq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new ajfq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfq.class);
            default:
                return null;
        }
    }
}
