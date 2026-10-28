package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajus extends aihn implements aiis {
    public static final ajus a;
    public int b;
    private ajwo d;
    private alay e;
    private byte f = 2;
    public aigj c = aigj.d;

    static {
        ajus ajusVar = new ajus();
        a = ajusVar;
        aihn.registerDefaultInstance(ajus.class, ajusVar);
    }

    private ajus() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0003", new Object[]{"b", "d", "e", "c"});
            case 3:
                return new ajus();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajus.class);
            default:
                return null;
        }
    }
}
