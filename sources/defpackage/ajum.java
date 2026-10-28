package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajum extends aihn implements aiis {
    public static final ajum a;
    public int b;
    private alay d;
    private ajwo e;
    private byte f = 2;
    public aigj c = aigj.d;

    static {
        ajum ajumVar = new ajum();
        a = ajumVar;
        aihn.registerDefaultInstance(ajum.class, ajumVar);
    }

    private ajum() {
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
                return new ajum();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajum.class);
            default:
                return null;
        }
    }
}
