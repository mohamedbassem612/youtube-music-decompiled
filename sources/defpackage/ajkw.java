package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajkw extends aihn implements aiis {
    public static final ajkw a;
    private int b;
    private alay c;
    private askp d;
    private alay e;
    private ajng f;
    private ajng g;
    private alay h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        ajkw ajkwVar = new ajkw();
        a = ajkwVar;
        aihn.registerDefaultInstance(ajkw.class, ajkwVar);
    }

    private ajkw() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\u0011\b\u0000\u0000\b\u0003ᐉ\u0006\u0004ᐉ\u0007\nᐉ\u0003\u000bᐉ\b\u000eᐉ\r\u000fᐉ\u000e\u0010ᐉ\u0004\u0011ᐉ\u000f", new Object[]{"b", "e", "f", "c", "g", "h", "i", "d", "j"});
            case 3:
                return new ajkw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkw.class);
            default:
                return null;
        }
    }
}
