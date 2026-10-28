package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amgf extends aihn implements aiis {
    public static final amgf a;
    public amgh b;
    private int c;
    private alay d;
    private byte e = 2;

    static {
        amgf amgfVar = new amgf();
        a = amgfVar;
        aihn.registerDefaultInstance(amgf.class, amgfVar);
    }

    private amgf() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0004", new Object[]{"c", "d", "b"});
            case 3:
                return new amgf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgf.class);
            default:
                return null;
        }
    }
}
