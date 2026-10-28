package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anlm extends aihn implements aiis {
    public static final anlm a;
    public int b;
    public apji c;
    public int e;
    public aiqe g;
    public anld h;
    public boolean i;
    public long j;
    private byte k = 2;
    public aiie d = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        anlm anlmVar = new anlm();
        a = anlmVar;
        aihn.registerDefaultInstance(anlm.class, anlmVar);
    }

    private anlm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0004ည\u0003\u0005ဉ\u0004\u0007ဉ\u0006\b᠌\u0001\tဇ\u0007\fဂ\b", new Object[]{"b", "c", "d", apji.class, "f", "g", "h", "e", ajpr.s, "i", "j"});
            case 3:
                return new anlm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anlm.class);
            default:
                return null;
        }
    }
}
