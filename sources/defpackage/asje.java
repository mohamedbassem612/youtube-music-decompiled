package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asje extends aihn implements aiis {
    public static final asje a;
    public int b;
    public asjf c;
    public asjl d;
    public asjm e;
    private byte f = 2;

    static {
        asje asjeVar = new asje();
        a = asjeVar;
        aihn.registerDefaultInstance(asje.class, asjeVar);
    }

    private asje() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asje();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asje.class);
            default:
                return null;
        }
    }
}
