package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajsb extends aihn implements aiis {
    public static final ajsb a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private apji f;
    private byte g = 2;

    static {
        ajsb ajsbVar = new ajsb();
        a = ajsbVar;
        aihn.registerDefaultInstance(ajsb.class, ajsbVar);
    }

    private ajsb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajsb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajsb.class);
            default:
                return null;
        }
    }
}
