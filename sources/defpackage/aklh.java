package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aklh extends aihn implements aiis {
    public static final aklh a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private alay f;
    private alay g;
    private alay h;
    private ajsc i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private byte n = 2;

    static {
        aklh aklhVar = new aklh();
        a = aklhVar;
        aihn.registerDefaultInstance(aklh.class, aklhVar);
    }

    private aklh() {
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\rᐉ\n\u000eᐉ\u000b\u000fᐉ\u0005\u0010ᐉ\f", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "g", "m"});
            case 3:
                return new aklh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklh.class);
            default:
                return null;
        }
    }
}
