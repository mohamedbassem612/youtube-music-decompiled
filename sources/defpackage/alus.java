package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alus extends aihn implements aiis {
    public static final alus a;
    public int b;
    public alop c;
    public alvl d;
    public ajwo e;
    public long f;
    public alve g;
    public aigj h;
    public aiie i;
    public aiie j;
    public aigj k;
    public String l;
    public String m;
    public aigj n;
    private ajwo o;
    private albe p;
    private byte q = 2;

    static {
        alus alusVar = new alus();
        a = alusVar;
        aihn.registerDefaultInstance(alus.class, alusVar);
    }

    private alus() {
        aigj aigjVar = aigj.d;
        this.h = aigjVar;
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        emptyProtobufList();
        this.k = aigjVar;
        this.l = "";
        this.m = "";
        this.n = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001̉\u000e\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0004\u0007ဂ\u0005\bဉ\u0006\nည\b\u000bЛ\rည\t\u000fЛ\u0010ဈ\u000b\u0011ဈ\f\u0013ᐉ\r\u0015ည\u0010̉ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", akjf.class, "k", "j", akjg.class, "l", "m", "o", "n", "p"});
            case 3:
                return new alus();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alus.class);
            default:
                return null;
        }
    }
}
