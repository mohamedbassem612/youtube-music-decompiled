package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajqd extends aihn implements aiis {
    public static final ajqd a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        ajqd ajqdVar = new ajqd();
        a = ajqdVar;
        aihn.registerDefaultInstance(ajqd.class, ajqdVar);
    }

    private ajqd() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u000b\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0006ᐉ\u0005\u000bᐉ\t", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajqd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqd.class);
            default:
                return null;
        }
    }
}
