package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amkz extends aihn implements aiis {
    public static final amkz a;
    public int b;
    public askp d;
    public askp e;
    public askp f;
    public askp g;
    public askp h;
    public askp i;
    public askp j;
    public askp k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public askp p;
    public askp q;
    public aplu r;
    public aplu s;
    public aplu t;
    public aplu u;
    public aplu v;
    public aplu w;
    public aqfc x;
    public aqfc y;
    public aqfc z;
    private byte A = 2;
    public String c = "";

    static {
        amkz amkzVar = new amkz();
        a = amkzVar;
        aihn.registerDefaultInstance(amkz.class, amkzVar);
    }

    private amkz() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0000\r\u0001ဈ\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fဂ\t\rဂ\n\u000eဂ\u000b\u000fဇ\f\u0011ᐉ\r\u0012ᐉ\u000e\u0013ဉ\u0013\u0014ဉ\u0014\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u000f\u0018ဉ\u0010\u0019ᐉ\u0015\u001aᐉ\u0016\u001bᐉ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "v", "w", "t", "u", "r", "s", "x", "y", "z"});
            case 3:
                return new amkz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amkz.class);
            default:
                return null;
        }
    }
}
