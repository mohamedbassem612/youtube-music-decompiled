package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alza extends aihn implements aiis {
    public static final alza a;
    public alop b;
    private int c;
    private alyy d;
    private ajpf e;
    private alyx f;
    private albe g;
    private byte h = 2;

    static {
        alza alzaVar = new alza();
        a = alzaVar;
        aihn.registerDefaultInstance(alza.class, alzaVar);
    }

    private alza() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0014ᐉ\u0010̉ᐉ\u0017", new Object[]{"c", "b", "d", "e", "f", "g"});
            case 3:
                return new alza();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alza.class);
            default:
                return null;
        }
    }
}
