package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alql extends aihn implements aiis {
    public static final alql a;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public Object j;
    public alop k;
    public alqi p;
    public int q;
    private albe r;
    public int c = 0;
    public int e = 0;
    public int g = 0;
    public int i = 0;
    private byte s = 2;
    public aiie l = emptyProtobufList();
    public aiie m = emptyProtobufList();
    public aigj n = aigj.d;
    public aiie o = emptyProtobufList();

    static {
        alql alqlVar = new alql();
        a = alqlVar;
        aihn.registerDefaultInstance(alql.class, alqlVar);
    }

    private alql() {
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
                return newMessageInfo(a, "\u0004\u0010\u0004\u0001\u0001̉\u0010\u0000\u0003\n\u0001ᐉ\u0000\u0002Л\u0003;\u0000\u0004Л\u0005;\u0001\u0007ည\u0002\bм\u0000\tм\u0001\nЛ\u000b;\u0002\fм\u0002\r;\u0003\u000eм\u0003\u000fᐉ\u0003\u0010င\u0004̉ᐉ\u0005", new Object[]{"d", "c", "f", "e", "h", "g", "j", "i", "b", "k", "l", alqj.class, "m", alqj.class, "n", ajwo.class, ajwo.class, "o", ajwo.class, ajwo.class, ajwo.class, "p", "q", "r"});
            case 3:
                return new alql();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alql.class);
            default:
                return null;
        }
    }
}
