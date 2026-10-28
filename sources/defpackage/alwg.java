package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alwg extends aihn implements aiis {
    public static final alwg a;
    public alop b;
    public alwe c;
    private int e;
    private byte f = 2;
    public aigj d = aigj.d;

    static {
        alwg alwgVar = new alwg();
        a = alwgVar;
        aihn.registerDefaultInstance(alwg.class, alwgVar);
    }

    private alwg() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0003", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new alwg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwg.class);
            default:
                return null;
        }
    }
}
