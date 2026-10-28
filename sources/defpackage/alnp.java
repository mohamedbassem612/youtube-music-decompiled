package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alnp extends aihn implements aiis {
    public static final alnp a;
    public alop b;
    public apjh c;
    private int e;
    private apji f;
    private albe g;
    private byte h = 2;
    public aigj d = aigj.d;

    static {
        alnp alnpVar = new alnp();
        a = alnpVar;
        aihn.registerDefaultInstance(alnp.class, alnpVar);
    }

    private alnp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ည\u0004\bᐉ\u0005̉ᐉ\u0006", new Object[]{"e", "b", "c", "d", "f", "g"});
            case 3:
                return new alnp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnp.class);
            default:
                return null;
        }
    }
}
