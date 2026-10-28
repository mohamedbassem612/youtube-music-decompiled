package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anft extends aihn implements aiis {
    public static final anft a;
    public int b;
    public alay c;
    public alja d;
    public ajwo e;
    public int g;
    public alja h;
    private byte j = 2;
    public aigj f = aigj.d;
    public boolean i = true;

    static {
        anft anftVar = new anft();
        a = anftVar;
        aihn.registerDefaultInstance(anft.class, anftVar);
    }

    private anft() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u0004\u0007᠌\u0006\fᐉ\n\rဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", amyr.g, "h", "i"});
            case 3:
                return new anft();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anft.class);
            default:
                return null;
        }
    }
}
