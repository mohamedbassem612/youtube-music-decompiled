package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajpx extends aihn implements aiis {
    public static final ajpx a;
    public static final aihl b;
    public int c;
    public boolean e;
    public int g;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public alay q;
    public boolean r;
    public boolean t;
    public boolean u;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    private byte A = 2;
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String s = "";
    public String v = "";

    static {
        ajpx ajpxVar = new ajpx();
        a = ajpxVar;
        aihn.registerDefaultInstance(ajpx.class, ajpxVar);
        b = aihn.newSingularGeneratedExtension(akvi.a, ajpxVar, ajpxVar, null, 218, aika.MESSAGE, ajpx.class);
    }

    private ajpx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0007\bဇ\b\tဇ\t\nဇ\n\u000bဇ\u000b\fဇ\f\rᐉ\r\u000eဇ\u000e\u000fဈ\u000f\u0010ဇ\u0010\u0011ဇ\u0011\u0012ဈ\u0012\u0013ဇ\u0013\u0014᠌\u0016\u0015᠌\u0015\u0016᠌\u0006\u0017ဇ\u0014", new Object[]{"c", "d", "e", "f", "g", aomi.f, "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "z", ajpr.c, "y", ajpr.d, "j", aocm.c, "x"});
            case 3:
                return new ajpx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajpx.class);
            default:
                return null;
        }
    }
}
