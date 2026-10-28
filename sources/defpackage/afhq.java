package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhq extends aihi implements aihj {
    public static final afhq a;
    public int b;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        afhq afhqVar = new afhq();
        a = afhqVar;
        aihn.registerDefaultInstance(afhq.class, afhqVar);
    }

    private afhq() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0007ဈ\b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new afhq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(afhq.class);
            default:
                return null;
        }
    }
}
