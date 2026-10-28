package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajsi extends aihn implements aiis {
    public static final ajsi a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private ajkl h;
    private aqyz i;
    private ajwo j;
    private byte k = 2;

    static {
        ajsi ajsiVar = new ajsi();
        a = ajsiVar;
        aihn.registerDefaultInstance(ajsi.class, ajsiVar);
    }

    private ajsi() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\f\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0006\u000bᐉ\t\fᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new ajsi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsi.class);
            default:
                return null;
        }
    }
}
