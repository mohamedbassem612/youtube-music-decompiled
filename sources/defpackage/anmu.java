package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anmu extends aihn implements aiis {
    public static final anmu a;
    public alay b;
    public alja c;
    public int d;
    public aiqe e;
    private int f;
    private byte g = 2;

    static {
        anmu anmuVar = new anmu();
        a = anmuVar;
        aihn.registerDefaultInstance(anmu.class, anmuVar);
    }

    private anmu() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"f", "b", "c", "d", anms.c, "e"});
            case 3:
                return new anmu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anmu.class);
            default:
                return null;
        }
    }
}
