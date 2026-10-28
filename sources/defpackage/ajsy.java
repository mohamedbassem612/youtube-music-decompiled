package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajsy extends aihn implements aiis {
    public static final ajsy a;
    public int b;
    public Object d;
    public ajsz e;
    public alay f;
    public ajwo g;
    public ajwo h;
    public int i;
    public aiqe j;
    public boolean k;
    public amyl o;
    public boolean p;
    private ajwo q;
    private alhs r;
    private apji s;
    private apji t;
    private apji u;
    public int c = 0;
    private byte v = 2;
    public String l = "";
    public aigj m = aigj.d;
    public String n = "";

    static {
        ajsy ajsyVar = new ajsy();
        a = ajsyVar;
        aihn.registerDefaultInstance(ajsy.class, ajsyVar);
    }

    private ajsy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0016\u0001\u0001\u0001\u0019\u0016\u0000\u0000\u000b\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ည\u000b\u0006м\u0000\u0007м\u0000\bဉ\u0006\tဇ\u0007\nᐉ\b\u000bဈ\t\fᐉ\f\rᐉ\u0003\u000e᠌\u0005\u000fဈ\r\u0011ဉ\u000f\u0012;\u0000\u0013ဇ\u0010\u0015м\u0000\u0016ᐉ\u0004\u0017ᐉ\u0013\u0018\u083f\u0000\u0019ᐉ\u0014", new Object[]{"d", "c", "b", "e", "f", "g", "m", aqmh.class, alja.class, "j", "k", "r", "l", "s", "h", "i", ajhk.m, "n", "o", "p", aqmh.class, "q", "t", aqvi.d, "u"});
            case 3:
                return new ajsy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsy.class);
            default:
                return null;
        }
    }
}
