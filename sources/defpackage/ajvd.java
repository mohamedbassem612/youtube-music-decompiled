package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajvd extends aihn implements aiis {
    public static final ajvd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private ajwo h;
    private ajwo i;
    private alay j;
    private alay k;
    private ajwo l;
    private byte m = 2;

    static {
        ajvd ajvdVar = new ajvd();
        a = ajvdVar;
        aihn.registerDefaultInstance(ajvd.class, ajvdVar);
    }

    private ajvd() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0004\u000f\n\u0000\u0000\n\u0004ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\u0004\nᐉ\u0005\u000bᐉ\u0006\fᐉ\u0007\rᐉ\b\u000eᐉ\t\u000fᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new ajvd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajvd.class);
            default:
                return null;
        }
    }
}
