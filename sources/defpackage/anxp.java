package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxp extends aihn implements aiis {
    public static final anxp a;
    public int b;
    public apji d;
    public apji e;
    public apji f;
    public apji g;
    private byte h = 2;
    public aigj c = aigj.d;

    static {
        anxp anxpVar = new anxp();
        a = anxpVar;
        aihn.registerDefaultInstance(anxp.class, anxpVar);
    }

    private anxp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ည\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new anxp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxp.class);
            default:
                return null;
        }
    }
}
