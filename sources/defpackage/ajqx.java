package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajqx extends aihn implements aiis {
    public static final ajqx a;
    private int b;
    private alay c;
    private ajwo d;
    private byte e = 2;

    static {
        ajqx ajqxVar = new ajqx();
        a = ajqxVar;
        aihn.registerDefaultInstance(ajqx.class, ajqxVar);
    }

    private ajqx() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0001\u0003ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new ajqx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqx.class);
            default:
                return null;
        }
    }
}
