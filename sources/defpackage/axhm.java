package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axhm extends aihn implements aiis {
    public static final axhm a;
    private int b;
    private ahab c;
    private byte d = 2;

    static {
        axhm axhmVar = new axhm();
        a = axhmVar;
        aihn.registerDefaultInstance(axhm.class, axhmVar);
    }

    private axhm() {
        emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new axhm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axhm.class);
            default:
                return null;
        }
    }
}
