package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akrv extends aihn implements aiis {
    public static final akrv a;
    private int c;
    private apji d;
    private byte e = 2;
    public aigj b = aigj.d;

    static {
        akrv akrvVar = new akrv();
        a = akrvVar;
        aihn.registerDefaultInstance(akrv.class, akrvVar);
    }

    private akrv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0002", new Object[]{"c", "d", "b"});
            case 3:
                return new akrv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akrv.class);
            default:
                return null;
        }
    }
}
