package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alhk extends aihn implements aiis {
    public static final alhk a;
    public int b;
    public alhl c;
    public boolean d;
    public alja e;
    public alay f;
    public ajwo g;
    public ajwo h;
    public aiqe i;
    private byte k = 2;
    public aigj j = aigj.d;

    static {
        alhk alhkVar = new alhk();
        a = alhkVar;
        aihn.registerDefaultInstance(alhk.class, alhkVar);
    }

    private alhk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0004\u0001ဉ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\tည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new alhk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhk.class);
            default:
                return null;
        }
    }
}
