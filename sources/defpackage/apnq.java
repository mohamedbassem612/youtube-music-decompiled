package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apnq extends aihn implements aiis {
    public static final apnq a;
    public int b;
    public alay c;
    private alay e;
    private ajwo f;
    private byte g = 2;
    public aigj d = aigj.d;

    static {
        apnq apnqVar = new apnq();
        a = apnqVar;
        aihn.registerDefaultInstance(apnq.class, apnqVar);
    }

    private apnq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0004", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new apnq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apnq.class);
            default:
                return null;
        }
    }
}
