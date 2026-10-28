package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqxn extends aihn implements aiis {
    public static final aqxn a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        aqxn aqxnVar = new aqxn();
        a = aqxnVar;
        aihn.registerDefaultInstance(aqxn.class, aqxnVar);
    }

    private aqxn() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0002\u0001ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new aqxn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxn.class);
            default:
                return null;
        }
    }
}
