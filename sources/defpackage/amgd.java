package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amgd extends aihn implements aiis {
    public static final amgd a;
    public int b;
    public alay c;
    private alay d;
    private ajnm e;
    private amgc f;
    private alay g;
    private alay h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        amgd amgdVar = new amgd();
        a = amgdVar;
        aihn.registerDefaultInstance(amgd.class, amgdVar);
    }

    private amgd() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\u000bᐉ\t\rᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "i"});
            case 3:
                return new amgd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgd.class);
            default:
                return null;
        }
    }
}
