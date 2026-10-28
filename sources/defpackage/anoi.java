package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anoi extends aihn implements aiis {
    public static final anoi a;
    public apji b;
    public alay c;
    public alay d;
    public anld e;
    public aiqe g;
    private int h;
    private byte i = 2;
    public aigj f = aigj.d;

    static {
        anoi anoiVar = new anoi();
        a = anoiVar;
        aihn.registerDefaultInstance(anoi.class, anoiVar);
    }

    private anoi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ည\u0005\u0007ဉ\u0006", new Object[]{"h", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new anoi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anoi.class);
            default:
                return null;
        }
    }
}
