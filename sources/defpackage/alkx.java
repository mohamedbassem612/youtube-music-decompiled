package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkx extends aihn implements aiis {
    public static final alkx a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        alkx alkxVar = new alkx();
        a = alkxVar;
        aihn.registerDefaultInstance(alkx.class, alkxVar);
    }

    private alkx() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u000b\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u000bᐉ\u0003", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new alkx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkx.class);
            default:
                return null;
        }
    }
}
