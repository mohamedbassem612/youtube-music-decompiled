package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aily extends aihn implements aiis {
    public static final aily a;
    public int b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public long i;
    public int j;
    public ajwo l;
    public anvl m;
    public anvo n;
    public ajta o;
    public ajta p;
    public aigj q;
    public ajwo r;
    public ajwo s;
    public aimm t;
    public apla u;
    public aigj v;
    private akrn w;
    private akrn x;
    private byte y = 2;
    public String g = "";
    public String h = "";
    public aiie k = emptyProtobufList();

    static {
        aily ailyVar = new aily();
        a = ailyVar;
        aihn.registerDefaultInstance(aily.class, ailyVar);
    }

    private aily() {
        aigj aigjVar = aigj.d;
        this.q = aigjVar;
        emptyProtobufList();
        this.v = aigjVar;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u001b\u0016\u0000\u0001\t\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bင\u0007\t\u001a\nᐉ\b\u000bᐉ\t\fᐉ\n\rᐉ\u000b\u000eᐉ\r\u000fည\u000f\u0010ᐉ\u0010\u0011ᐉ\u0011\u0012ဉ\u0012\u0013ဉ\u0013\u0018ည\u0014\u001aᐉ\f\u001bᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
            case 3:
                return new aily();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aily.class);
            default:
                return null;
        }
    }
}
