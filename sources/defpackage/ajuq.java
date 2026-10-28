package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajuq extends aihn implements aiis {
    public static final ajuq a;
    public int b;
    private alay d;
    private byte e = 2;
    public aigj c = aigj.d;

    static {
        ajuq ajuqVar = new ajuq();
        a = ajuqVar;
        aihn.registerDefaultInstance(ajuq.class, ajuqVar);
    }

    private ajuq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0002", new Object[]{"b", "d", "c"});
            case 3:
                return new ajuq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajuq.class);
            default:
                return null;
        }
    }
}
