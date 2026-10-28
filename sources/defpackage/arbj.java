package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arbj extends aihn implements aiis {
    public static final arbj a;
    public aqmh d;
    public boolean f;
    private int g;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        arbj arbjVar = new arbj();
        a = arbjVar;
        aihn.registerDefaultInstance(arbj.class, arbjVar);
    }

    private arbj() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0005ဈ\u0004\u0007ဇ\u0006", new Object[]{"g", "b", "c", "d", "e", "f"});
            case 3:
                return new arbj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arbj.class);
            default:
                return null;
        }
    }
}
