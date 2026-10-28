package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aprp extends aihn implements aiis {
    public static final aprp a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private alay g;
    private ajwo h;
    private byte i = 2;

    static {
        aprp aprpVar = new aprp();
        a = aprpVar;
        aihn.registerDefaultInstance(aprp.class, aprpVar);
    }

    private aprp() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0006\u0001ᐉ\u0002\u0002ᐉ\u0007\u0003ᐉ\b\u0006ᐉ\u0005\bᐉ\u0006\fᐉ\u0003", new Object[]{"b", "c", "g", "h", "e", "f", "d"});
            case 3:
                return new aprp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprp.class);
            default:
                return null;
        }
    }
}
