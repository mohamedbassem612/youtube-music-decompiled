package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arqd extends aihi implements aihj {
    public static final arqd a;
    public alay c;
    private int d;
    private byte e = 2;
    public aigj b = aigj.d;

    static {
        arqd arqdVar = new arqd();
        a = arqdVar;
        aihn.registerDefaultInstance(arqd.class, arqdVar);
    }

    private arqd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ည\u0000\u0004ᐉ\u0004", new Object[]{"d", "b", "c"});
            case 3:
                return new arqd();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arqd.class);
            default:
                return null;
        }
    }
}
