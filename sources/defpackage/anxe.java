package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxe extends aihn implements aiis {
    public static final anxe a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public alay f;
    public alay g;
    public apji i;
    public int j;
    public ajwo k;
    public ajwo l;
    public aiqe n;
    public apji o;
    private apji r;
    private byte s = 2;
    public aiie h = emptyProtobufList();
    public aigj m = aigj.d;
    public aiie p = emptyProtobufList();
    public aiie q = emptyProtobufList();

    static {
        anxe anxeVar = new anxe();
        a = anxeVar;
        aihn.registerDefaultInstance(anxe.class, anxeVar);
    }

    private anxe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0003\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\t\bည\f\tဉ\r\u000bᐉ\u000e\fᐉ\n\rЛ\u000eЛ\u000fᐉ\u0004\u0010ᐉ\u0007\u0011᠌\b\u0012Л", new Object[]{"b", "c", "d", "e", "f", "r", "k", "m", "n", "o", "l", "q", apji.class, "p", apji.class, "g", "i", "j", anms.g, "h", apji.class});
            case 3:
                return new anxe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxe.class);
            default:
                return null;
        }
    }
}
