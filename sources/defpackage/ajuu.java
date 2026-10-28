package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajuu extends aihn implements aiis {
    public static final ajuu a;
    public int b;
    private ajwo d;
    private alay e;
    private alay f;
    private byte g = 2;
    public aigj c = aigj.d;

    static {
        ajuu ajuuVar = new ajuu();
        a = ajuuVar;
        aihn.registerDefaultInstance(ajuu.class, ajuuVar);
    }

    private ajuu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0005\u0005ᐉ\u0003", new Object[]{"b", "d", "e", "c", "f"});
            case 3:
                return new ajuu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajuu.class);
            default:
                return null;
        }
    }
}
