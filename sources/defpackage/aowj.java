package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aowj extends aihn implements aiis {
    public static final aowj a;
    public int b;
    public alay c;
    public aqmh d;
    public aqmh e;
    public alay f;
    public alay g;
    public apji h;
    private byte i = 2;

    static {
        aowj aowjVar = new aowj();
        a = aowjVar;
        aihn.registerDefaultInstance(aowj.class, aowjVar);
    }

    private aowj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
            case 3:
                return new aowj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowj.class);
            default:
                return null;
        }
    }
}
