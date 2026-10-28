package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annx extends aihn implements aiis {
    public static final annx a;
    public int b;
    public apji c;
    public apji d;
    private byte g = 2;
    public aigj e = aigj.d;
    public String f = "";

    static {
        annx annxVar = new annx();
        a = annxVar;
        aihn.registerDefaultInstance(annx.class, annxVar);
    }

    private annx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new annx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(annx.class);
            default:
                return null;
        }
    }
}
