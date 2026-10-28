package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alff extends aihn implements aiis {
    public static final alff a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajwo k;
    private ajkl l;
    private ajkl m;
    private ajkl n;
    private ajng o;
    private byte p = 2;

    static {
        alff alffVar = new alff();
        a = alffVar;
        aihn.registerDefaultInstance(alff.class, alffVar);
    }

    private alff() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u0018\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\u000b\u0012ᐉ\t\u0013ᐉ\r\u0014ᐉ\f\u0015ᐉ\u000e\u0016ᐉ\u0003\u0018ᐉ\u0012", new Object[]{"b", "c", "e", "f", "g", "h", "j", "k", "i", "m", "l", "n", "d", "o"});
            case 3:
                return new alff();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alff.class);
            default:
                return null;
        }
    }
}
