package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auiq extends aihn implements aiis {
    public static final auiq a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        auiq auiqVar = new auiq();
        a = auiqVar;
        aihn.registerDefaultInstance(auiq.class, auiqVar);
    }

    private auiq() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u000b", new Object[]{"b", "c"});
            case 3:
                return new auiq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auiq.class);
            default:
                return null;
        }
    }
}
