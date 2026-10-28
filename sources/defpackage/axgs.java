package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axgs extends aihn implements aiis {
    public static final axgs a;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public axhf n;
    public axgr o;
    public int p;
    public axgh q;
    public long r;
    public int s;
    public int t;
    public int u;
    public int v;
    public String w;
    public aihy x;
    public String y;
    public axgu z;
    public int c = 0;
    private byte A = 2;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        axgs axgsVar = new axgs();
        a = axgsVar;
        aihn.registerDefaultInstance(axgs.class, axgsVar);
    }

    private axgs() {
        emptyProtobufList();
        this.w = "";
        this.x = emptyLongList();
        this.y = "";
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
                return newMessageInfo(a, "\u0001\u0016\u0001\u0001\u0001\u001d\u0016\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\fᐉ\r\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u001c5\u0000\u001d<\u0000", new Object[]{"d", "c", "b", "e", "f", "h", "i", "j", "k", "l", "m", audg.s, "n", "o", "q", "r", "s", audg.t, "t", audg.r, "v", "w", "u", "y", "x", "z", axhh.class});
            case 3:
                return new axgs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axgs.class);
            default:
                return null;
        }
    }
}
