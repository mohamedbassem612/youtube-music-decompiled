package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsd extends aihn implements aiis {
    public static final aqsd a;
    public ajng b;
    private int c;
    private alay d;
    private byte e = 2;

    static {
        aqsd aqsdVar = new aqsd();
        a = aqsdVar;
        aihn.registerDefaultInstance(aqsd.class, aqsdVar);
    }

    private aqsd() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0004ᐉ\u0004", new Object[]{"c", "d", "b"});
            case 3:
                return new aqsd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsd.class);
            default:
                return null;
        }
    }
}
