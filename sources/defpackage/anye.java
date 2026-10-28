package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anye extends aihn implements aiis {
    public static final anye a;
    public int b;
    public alay c;
    public alja d;
    public ajwo e;
    public aiqe f;
    private byte h = 2;
    public aigj g = aigj.d;

    static {
        anye anyeVar = new anye();
        a = anyeVar;
        aihn.registerDefaultInstance(anye.class, anyeVar);
    }

    private anye() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ည\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new anye();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anye.class);
            default:
                return null;
        }
    }
}
