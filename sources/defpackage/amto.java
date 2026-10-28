package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amto extends aihn implements aiis {
    public static final amto a;
    public int b;
    public alay d;
    public aqmh e;
    public alay f;
    public alay g;
    private byte h = 2;
    public String c = "";

    static {
        amto amtoVar = new amto();
        a = amtoVar;
        aihn.registerDefaultInstance(amto.class, amtoVar);
    }

    private amto() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0011\u0005\u0000\u0000\u0004\u0001ᐉ\u0002\u0002ᐉ\u0003\nᐉ\u0004\u0010ᐉ\u0005\u0011ဈ\u0000", new Object[]{"b", "d", "e", "f", "g", "c"});
            case 3:
                return new amto();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amto.class);
            default:
                return null;
        }
    }
}
