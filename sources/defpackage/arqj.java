package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arqj extends aihn implements aiis {
    public static final arqj a;
    public alay b;
    public alay c;
    public alay d;
    private int e;
    private byte f = 2;

    static {
        arqj arqjVar = new arqj();
        a = arqjVar;
        aihn.registerDefaultInstance(arqj.class, arqjVar);
    }

    private arqj() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "b", "c", "d"});
            case 3:
                return new arqj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arqj.class);
            default:
                return null;
        }
    }
}
