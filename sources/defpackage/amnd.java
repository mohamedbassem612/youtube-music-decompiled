package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amnd extends aihn implements aiis {
    public static final amnd a;
    public int b;
    public apji d;
    public ajwo e;
    private apji f;
    private byte g = 2;
    public String c = "";

    static {
        amnd amndVar = new amnd();
        a = amndVar;
        aihn.registerDefaultInstance(amnd.class, amndVar);
    }

    private amnd() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000\u0005ᐉ\u0004", new Object[]{"b", "f", "d", "c", "e"});
            case 3:
                return new amnd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amnd.class);
            default:
                return null;
        }
    }
}
