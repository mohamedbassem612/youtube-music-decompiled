package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoxo extends aihn implements aiis {
    public static final aoxo a;
    private int b;
    private ajwo c;
    private apji d;
    private byte e = 2;

    static {
        aoxo aoxoVar = new aoxo();
        a = aoxoVar;
        aihn.registerDefaultInstance(aoxo.class, aoxoVar);
    }

    private aoxo() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new aoxo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxo.class);
            default:
                return null;
        }
    }
}
