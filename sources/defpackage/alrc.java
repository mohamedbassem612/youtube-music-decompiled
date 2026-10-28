package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrc extends aihn implements aiis {
    public static final alrc a;
    public int b;
    public alop c;
    public aigj e;
    public alqz f;
    public ajwo g;
    public arbj h;
    private albe i;
    private apji j;
    private ajlf k;
    private aphu l;
    private apji m;
    private apji n;
    private byte o = 2;
    public aiie d = emptyProtobufList();

    static {
        alrc alrcVar = new alrc();
        a = alrcVar;
        aihn.registerDefaultInstance(alrc.class, alrcVar);
    }

    private alrc() {
        emptyProtobufList();
        this.e = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001̉\f\u0000\u0001\u000b\u0001ᐉ\u0000\u0004Л\u0005ည\u0004\bᐉ\u0006\rᐉ\b\u000eᐉ\t\u000fᐉ\u000b\u0010ᐉ\f\u0012ᐉ\r\u0013ᐉ\n\u0014ᐉ\u000ẻᐉ\u0007", new Object[]{"b", "c", "d", alrd.class, "e", "f", "j", "k", "m", "n", "g", "l", "h", "i"});
            case 3:
                return new alrc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrc.class);
            default:
                return null;
        }
    }
}
