package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajqp extends aihn implements aiis {
    public static final ajqp a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        ajqp ajqpVar = new ajqp();
        a = ajqpVar;
        aihn.registerDefaultInstance(ajqp.class, ajqpVar);
    }

    private ajqp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ajqp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajqp.class);
            default:
                return null;
        }
    }
}
