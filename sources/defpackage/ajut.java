package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajut extends aihn implements aiis {
    public static final ajut a;
    public int b;
    private ajwo d;
    private alay e;
    private alay f;
    private byte g = 2;
    public aigj c = aigj.d;

    static {
        ajut ajutVar = new ajut();
        a = ajutVar;
        aihn.registerDefaultInstance(ajut.class, ajutVar);
    }

    private ajut() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0005", new Object[]{"b", "d", "e", "f", "c"});
            case 3:
                return new ajut();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajut.class);
            default:
                return null;
        }
    }
}
