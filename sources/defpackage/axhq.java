package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axhq extends aihn implements aiis {
    public static final axhq a;
    public int b;
    public boolean c;
    public axhg d;
    public int g;
    public ahag i;
    public aior j;
    public axhp k;
    public axhn l;
    private byte m = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        axhq axhqVar = new axhq();
        a = axhqVar;
        aihn.registerDefaultInstance(axhq.class, axhqVar);
    }

    private axhq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", axhk.d, "h", "i", "j", "k", "l"});
            case 3:
                return new axhq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axhq.class);
            default:
                return null;
        }
    }
}
