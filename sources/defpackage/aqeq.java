package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqeq extends aihn implements aiis {
    public static final aqeq a;
    private int b;
    private aola c;
    private akmh d;
    private byte e = 2;

    static {
        aqeq aqeqVar = new aqeq();
        a = aqeqVar;
        aihn.registerDefaultInstance(aqeq.class, aqeqVar);
    }

    private aqeq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱃ\u196f\ue81b᷷\u0002\u0000\u0000\u0002ﱃ\u196fᐉ\u0001\ue81b᷷ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new aqeq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqeq.class);
            default:
                return null;
        }
    }
}
