package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apzm extends aihn implements aiis {
    public static final apzm a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        apzm apzmVar = new apzm();
        a = apzmVar;
        aihn.registerDefaultInstance(apzm.class, apzmVar);
    }

    private apzm() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003ᐉ\u0000\u0004ᐉ\u0001\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apzm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzm.class);
            default:
                return null;
        }
    }
}
