package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anfl extends aihn implements aiis {
    public static final anfl a;
    private int b;
    private alay c;
    private ajng d;
    private ajng e;
    private apji f;
    private apji g;
    private apji h;
    private alay i;
    private apji j;
    private byte k = 2;

    static {
        anfl anflVar = new anfl();
        a = anflVar;
        aihn.registerDefaultInstance(anfl.class, anflVar);
    }

    private anfl() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0004ᐉ\u0002\nᐉ\u0007\u000bᐉ\b\fᐉ\n\rᐉ\t\u000eᐉ\u0005\u000fᐉ\u000b", new Object[]{"b", "c", "d", "f", "g", "i", "h", "e", "j"});
            case 3:
                return new anfl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfl.class);
            default:
                return null;
        }
    }
}
