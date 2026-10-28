package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aprd extends aihn implements aiis {
    public static final aprd a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public ajwo f;
    public ajwo g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private apji m;
    private byte n = 2;

    static {
        aprd aprdVar = new aprd();
        a = aprdVar;
        aihn.registerDefaultInstance(aprd.class, aprdVar);
    }

    private aprd() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u000b\u0001ᐉ\u0001\u0002ᐉ\u0005\u0003ᐉ\u0003\u0004ᐉ\b\u0005ᐉ\t\u0007ᐉ\u0004\u000bᐉ\u0006\fᐉ\u0007\u000fᐉ\u0002\u0010ᐉ\f\u0011ᐉ\u000f", new Object[]{"b", "c", "e", "d", "f", "g", "i", "j", "k", "h", "l", "m"});
            case 3:
                return new aprd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprd.class);
            default:
                return null;
        }
    }
}
