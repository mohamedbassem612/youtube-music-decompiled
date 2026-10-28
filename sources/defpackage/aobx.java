package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobx extends aihn implements aiis {
    public static final aobx a;
    public int b;
    public Object d;
    public boolean g;
    public akel h;
    public ajtt i;
    private alay j;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public aigj f = aigj.d;

    static {
        aobx aobxVar = new aobx();
        a = aobxVar;
        aihn.registerDefaultInstance(aobx.class, aobxVar);
    }

    private aobx() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\r\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ည\u0002\u0003ᐉ\u0003\u0007ဇ\u0006\b:\u0000\t7\u0000\n:\u0000\fဉ\b\rဉ\t", new Object[]{"d", "c", "b", "e", "f", "j", "g", "h", "i"});
            case 3:
                return new aobx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobx.class);
            default:
                return null;
        }
    }
}
