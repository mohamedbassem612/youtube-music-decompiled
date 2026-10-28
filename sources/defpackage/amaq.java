package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amaq extends aihn implements aiis {
    public static final amaq a;
    public int b;
    public Object d;
    public alop e;
    public ajwo f;
    public int h;
    private albe i;
    public int c = 0;
    private byte j = 2;
    public aigj g = aigj.d;

    static {
        amaq amaqVar = new amaq();
        a = amaqVar;
        aihn.registerDefaultInstance(amaq.class, amaqVar);
    }

    private amaq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001̉\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002м\u0000\u0003м\u0000\u0004ည\u0003\u0006᠌\u0005\u0007ᐉ\u0001̉ᐉ\u0002", new Object[]{"d", "c", "b", "e", akco.class, apyl.class, "g", "h", arke.n, "f", "i"});
            case 3:
                return new amaq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amaq.class);
            default:
                return null;
        }
    }
}
