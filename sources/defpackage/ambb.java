package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ambb extends aihn implements aiis {
    public static final ambb a;
    public alop b;
    private int c;
    private albe d;
    private byte e = 2;

    static {
        ambb ambbVar = new ambb();
        a = ambbVar;
        aihn.registerDefaultInstance(ambb.class, ambbVar);
    }

    private ambb() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001̉\u0002\u0000\u0000\u0002\u0001ᐉ\u0000̉ᐉ\u0005", new Object[]{"c", "b", "d"});
            case 3:
                return new ambb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambb.class);
            default:
                return null;
        }
    }
}
