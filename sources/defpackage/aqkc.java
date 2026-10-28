package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqkc extends aihn implements aiis {
    public static final aqkc a;
    private int b;
    private aoss c;
    private arir d;
    private byte e = 2;

    static {
        aqkc aqkcVar = new aqkc();
        a = aqkcVar;
        aihn.registerDefaultInstance(aqkc.class, aqkcVar);
    }

    private aqkc() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d"});
            case 3:
                return new aqkc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqkc.class);
            default:
                return null;
        }
    }
}
