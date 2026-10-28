package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anzl extends aihn implements aiis {
    public static final anzl a;
    public int b;
    public alay c;
    private byte e = 2;
    public aigj d = aigj.d;

    static {
        anzl anzlVar = new anzl();
        a = anzlVar;
        aihn.registerDefaultInstance(anzl.class, anzlVar);
    }

    private anzl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new anzl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzl.class);
            default:
                return null;
        }
    }
}
