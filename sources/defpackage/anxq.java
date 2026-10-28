package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anxq extends aihn implements aiis {
    public static final anxq a;
    public apji b;
    public alay c;
    public alay d;
    public alay e;
    public ajwo f;
    public ajwo g;
    public aiqe i;
    public apji j;
    private int m;
    private apji n;
    private byte o = 2;
    public aigj h = aigj.d;
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();

    static {
        anxq anxqVar = new anxq();
        a = anxqVar;
        aihn.registerDefaultInstance(anxq.class, anxqVar);
    }

    private anxq() {
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
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001\u000e\f\u0000\u0002\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bည\u0007\tᐉ\b\nဉ\t\u000bᐉ\n\fЛ\u000eЛ", new Object[]{"m", "b", "c", "d", "e", "f", "g", "h", "n", "i", "j", "k", apji.class, "l", apji.class});
            case 3:
                return new anxq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxq.class);
            default:
                return null;
        }
    }
}
