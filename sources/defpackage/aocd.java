package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocd extends aihn implements aiis {
    public static final aocd a;
    public int b;
    public alay c;
    public ajng d;
    public int f;
    private alay g;
    private ajng h;
    private byte i = 2;
    public aigj e = aigj.d;

    static {
        aocd aocdVar = new aocd();
        a = aocdVar;
        aihn.registerDefaultInstance(aocd.class, aocdVar);
    }

    private aocd() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ည\u0004\u0005ᐉ\u0001\u0006ᐉ\u0006\u0007᠌\u0007", new Object[]{"b", "c", "d", "e", "g", "h", "f", apdr.u});
            case 3:
                return new aocd();
            case 4:
                return new aihf((float[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aocd.class);
            default:
                return null;
        }
    }
}
