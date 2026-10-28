package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsa extends aihn implements aiis {
    public static final aqsa a;
    private int b;
    private ajng c;
    private alay d;
    private alay e;
    private aqsb f;
    private byte g = 2;

    static {
        aqsa aqsaVar = new aqsa();
        a = aqsaVar;
        aihn.registerDefaultInstance(aqsa.class, aqsaVar);
    }

    private aqsa() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0005\u000e\u0004\u0000\u0000\u0004\u0005ᐉ\u0000\tᐉ\u0002\nᐉ\u0003\u000eᐉ\b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqsa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsa.class);
            default:
                return null;
        }
    }
}
