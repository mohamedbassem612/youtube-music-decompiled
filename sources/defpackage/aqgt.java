package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqgt extends aihn implements aiis {
    public static final aqgt a;
    public int b;
    public aqgw c;
    public alay e;
    public ajwo f;
    public aiie g;
    public aigj h;
    public long i;
    public aiie j;
    public aiie k;
    public int l;
    public int m;
    private alay n;
    private ajng o;
    private ajng p;
    private ajwo q;
    private byte r = 2;
    public aiie d = emptyProtobufList();

    static {
        aqgt aqgtVar = new aqgt();
        a = aqgtVar;
        aihn.registerDefaultInstance(aqgt.class, aqgtVar);
    }

    private aqgt() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = aigj.d;
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0004\b\u0001ᐉ\u0001\u0002Л\u0004ည\n\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ဃ\u000b\t᠌\r\nЛ\u000bဉ\u0000\rᐉ\u0006\u000fᐉ\u0004\u0010ᐉ\u0005\u0012င\u000f\u0014\u001b\u0015\u001b", new Object[]{"b", "e", "g", aqgu.class, "h", "n", "f", "i", "l", aqgv.b, "d", aqgr.class, "c", "q", "o", "p", "m", "j", aqgc.class, "k", aqga.class});
            case 3:
                return new aqgt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgt.class);
            default:
                return null;
        }
    }
}
