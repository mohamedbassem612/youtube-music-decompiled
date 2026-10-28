package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqjx extends aihn implements aiis {
    public static final aqjx a;
    public apji b;
    public int d;
    public ajng e;
    public int g;
    public ajwo h;
    private int j;
    private alay k;
    private alay l;
    private apji m;
    private ajng n;
    private byte o = 2;
    public aiie c = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aigj i = aigj.d;

    static {
        aqjx aqjxVar = new aqjx();
        a = aqjxVar;
        aihn.registerDefaultInstance(aqjx.class, aqjxVar);
    }

    private aqjx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006Л\tည\u000b\nင\b\u000bᐉ\t\f᠌\u0004\rᐉ\u0002\u000eᐉ\u0003", new Object[]{"j", "k", "l", "c", aqjs.class, "e", "n", "f", ajwo.class, "i", "g", "h", "d", aqgv.l, "m", "b"});
            case 3:
                return new aqjx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjx.class);
            default:
                return null;
        }
    }
}
