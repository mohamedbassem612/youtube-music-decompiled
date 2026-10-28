package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocq extends aihn implements aiis {
    public static final aocq a;
    public static final aihl b;
    public int c;
    public aigj d;
    public alay e;
    public aigj f;
    public aiie g;
    private alay h;
    private byte i = 2;

    static {
        aocq aocqVar = new aocq();
        a = aocqVar;
        aihn.registerDefaultInstance(aocq.class, aocqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aocqVar, aocqVar, null, 65091333, aika.MESSAGE, aocq.class);
    }

    private aocq() {
        aigj aigjVar = aigj.d;
        this.d = aigjVar;
        emptyProtobufList();
        this.f = aigjVar;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0000\bည\u0004\tЛ", new Object[]{"c", "h", "e", "d", "f", "g", ajwo.class});
            case 3:
                return new aocq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aocq.class);
            default:
                return null;
        }
    }
}
