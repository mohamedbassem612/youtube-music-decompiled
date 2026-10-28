package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqrx extends aihn implements aiis {
    public static final aqrx a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqrx aqrxVar = new aqrx();
        a = aqrxVar;
        aihn.registerDefaultInstance(aqrx.class, aqrxVar);
    }

    private aqrx() {
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
                return newMessageInfo(a, "\u0004\u0001\u0001\u0000\uf3fbヺ\uf3fbヺ\u0001\u0000\u0000\u0001\uf3fbヺм\u0000", new Object[]{"c", "b", alhq.class});
            case 3:
                return new aqrx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqrx.class);
            default:
                return null;
        }
    }
}
