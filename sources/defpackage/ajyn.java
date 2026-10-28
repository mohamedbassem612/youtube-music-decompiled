package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyn extends aihn implements aiis {
    public static final ajyn a;
    public int b;
    public ajys c;
    private ajzd d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        ajyn ajynVar = new ajyn();
        a = ajynVar;
        aihn.registerDefaultInstance(ajyn.class, ajynVar);
    }

    private ajyn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "d", "e", "f", "c"});
            case 3:
                return new ajyn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyn.class);
            default:
                return null;
        }
    }
}
