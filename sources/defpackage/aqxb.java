package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqxb extends aihn implements aiis {
    public static final aqxb a;
    public alay b;
    public int e;
    public ajng f;
    public ajng g;
    private int k;
    private alay l;
    private alay m;
    private alay n;
    private ajwo o;
    private byte p = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aigj h = aigj.d;
    public aiie i = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        aqxb aqxbVar = new aqxb();
        a = aqxbVar;
        aihn.registerDefaultInstance(aqxb.class, aqxbVar);
    }

    private aqxb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u0010\r\u0000\u0004\u000b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0007\u0005ᐉ\t\u0006Л\u0007ᐉ\u0003\bᐉ\u0004\nည\u0006\u000bင\u0002\fЛ\rЛ\u000eᐉ\n\u0010ᐉ\u0001", new Object[]{"k", "b", "c", alay.class, "m", "n", "d", aqxa.class, "f", "g", "h", "e", "i", ajwo.class, "j", ajwo.class, "o", "l"});
            case 3:
                return new aqxb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxb.class);
            default:
                return null;
        }
    }
}
