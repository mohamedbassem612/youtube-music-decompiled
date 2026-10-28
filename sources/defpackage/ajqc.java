package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajqc extends aihn implements aiis {
    public static final ajqc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private akoc f;
    private alay g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        ajqc ajqcVar = new ajqc();
        a = ajqcVar;
        aihn.registerDefaultInstance(ajqc.class, ajqcVar);
    }

    private ajqc() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0002\u0013\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0006ᐉ\u0005\u000eᐉ\u000e\u0010ᐉ\n\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011", new Object[]{"b", "c", "d", "f", "e", "g", "h", "i"});
            case 3:
                return new ajqc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqc.class);
            default:
                return null;
        }
    }
}
