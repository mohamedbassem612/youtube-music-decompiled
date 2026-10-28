package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxo extends aihn implements aiis {
    public static final aqxo a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private apji i;
    private ajwo j;
    private byte k = 2;

    static {
        aqxo aqxoVar = new aqxo();
        a = aqxoVar;
        aihn.registerDefaultInstance(aqxo.class, aqxoVar);
    }

    private aqxo() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0007\u0006ᐉ\u0005\u0007ᐉ\u0004\rᐉ\u0002\u0011ᐉ\u0006", new Object[]{"b", "c", "d", "f", "j", "h", "g", "e", "i"});
            case 3:
                return new aqxo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxo.class);
            default:
                return null;
        }
    }
}
