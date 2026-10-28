package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oho extends aihi implements aihj {
    public static final oho a;
    public int b;
    public long e;
    public long f;
    public aifv g;
    public boolean h;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        oho ohoVar = new oho();
        a = ohoVar;
        aihn.registerDefaultInstance(oho.class, ohoVar);
    }

    private oho() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new oho();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(oho.class);
            default:
                return null;
        }
    }
}
