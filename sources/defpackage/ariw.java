package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ariw extends aihn implements aiis {
    public static final ariw a;
    public int b;
    public int d;
    public ajwo f;
    public arid g;
    public ariv h;
    private byte i = 2;
    public String c = "";
    public String e = "";

    static {
        ariw ariwVar = new ariw();
        a = ariwVar;
        aihn.registerDefaultInstance(ariw.class, ariwVar);
    }

    private ariw() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\ue6d2⸏\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဋ\u0001\u0004ဈ\u0002\u0006ᐉ\u0004\u0007ဉ\b\ue6d2⸏ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new ariw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ariw.class);
            default:
                return null;
        }
    }
}
