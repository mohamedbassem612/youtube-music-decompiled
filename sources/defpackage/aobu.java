package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aobu extends aihn implements aiis {
    public static final aobu a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private ajkl m;
    private aqyz n;
    private byte o = 2;

    static {
        aobu aobuVar = new aobu();
        a = aobuVar;
        aihn.registerDefaultInstance(aobu.class, aobuVar);
    }

    private aobu() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0004\u0012\f\u0000\u0000\f\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\n\tᐉ\u000b\nᐉ\u0001\u000bᐉ\u0003\fᐉ\u0005\u000eᐉ\r\u0011ᐉ\t\u0012ᐉ\f", new Object[]{"b", "e", "g", "h", "i", "k", "l", "c", "d", "f", "n", "j", "m"});
            case 3:
                return new aobu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobu.class);
            default:
                return null;
        }
    }
}
