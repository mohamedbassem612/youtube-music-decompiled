package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aipe extends aihi implements aihj {
    public static final aipe a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        aipe aipeVar = new aipe();
        a = aipeVar;
        aihn.registerDefaultInstance(aipe.class, aipeVar);
    }

    private aipe() {
        emptyIntList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
            case 3:
                return new aipe();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipe.class);
            default:
                return null;
        }
    }
}
