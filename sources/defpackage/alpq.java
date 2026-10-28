package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alpq extends aihn implements aiis {
    public static final alpq a;
    public alop b;
    private int c;
    private ajwo d;
    private albe e;
    private byte f = 2;

    static {
        alpq alpqVar = new alpq();
        a = alpqVar;
        aihn.registerDefaultInstance(alpq.class, alpqVar);
    }

    private alpq() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001̉ᐉ\u0004", new Object[]{"c", "b", "d", "e"});
            case 3:
                return new alpq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpq.class);
            default:
                return null;
        }
    }
}
