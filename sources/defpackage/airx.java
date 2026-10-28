package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airx extends aihn implements aiis {
    public static final airx a;
    public int b;
    public int c;
    public askp e;
    public asnm f;
    public askp g;
    public aisk h;
    private int i;
    private ajwo j;
    private ajwo k;
    private ajwo l;
    private ajwo m;
    private ajwo n;
    private ajwo o;
    private ajwo p;
    private airz q;
    private airt r;
    private airy s;
    private askp t;
    private askp u;
    private ajwo v;
    private askp w;
    private ajwo x;
    private ajwo y;
    private byte z = 2;
    public String d = "";

    static {
        airx airxVar = new airx();
        a = airxVar;
        aihn.registerDefaultInstance(airx.class, airxVar);
    }

    private airx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0002\u0001!\u0016\u0000\u0000\u0013\u0001ဈ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0018\tᐉ\u0019\nᐉ\u001a\u000b᠌\u0000\fဉ\u0011\rᐉ\u0012\u000fᐉ\u000f\u0011ᐉ\u001b\u0012ᐉ\u001c\u0013ᐉ\u001d\u0014ᐉ\u001e\u0015ᐉ\u0006\u0016ᐉ\u0007\u0017ᐉ\b\u0018ᐉ\t\u0019ᐉ\n ᐉ\u001f!ᐉ ", new Object[]{"b", "i", "d", "e", "f", "g", "q", "r", "s", "c", aiod.p, "h", "p", "o", "t", "u", "v", "w", "j", "k", "l", "m", "n", "x", "y"});
            case 3:
                return new airx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(airx.class);
            default:
                return null;
        }
    }
}
