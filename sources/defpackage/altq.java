package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class altq extends aihn implements aiis {
    public static final altq a;
    public int b;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    private alay h;
    private byte i = 2;
    public String c = "";

    static {
        altq altqVar = new altq();
        a = altqVar;
        aihn.registerDefaultInstance(altq.class, altqVar);
    }

    private altq() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "g"});
            case 3:
                return new altq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altq.class);
            default:
                return null;
        }
    }
}
