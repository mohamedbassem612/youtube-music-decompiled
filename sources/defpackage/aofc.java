package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aofc extends aihn implements aiis {
    public static final aofc a;
    public int b;
    public boolean c;
    public aqmh d;
    public int e;
    public akke f;
    public int h;
    public int j;
    public boolean l;
    public aofd m;
    private byte n = 2;
    public String g = "";
    public String i = "";
    public String k = "";

    static {
        aofc aofcVar = new aofc();
        a = aofcVar;
        aihn.registerDefaultInstance(aofc.class, aofcVar);
    }

    private aofc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0007᠌\u0006\bဈ\u0007\nင\t\fဈ\u000b\rဇ\f\u0010ဉ\r", new Object[]{"b", "c", "d", "e", anms.e, "f", "g", "h", anbz.t, "i", "j", "k", "l", "m"});
            case 3:
                return new aofc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aofc.class);
            default:
                return null;
        }
    }
}
