package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqom extends aihn implements aiis {
    public static final aqom a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajng f;
    private byte g = 2;

    static {
        aqom aqomVar = new aqom();
        a = aqomVar;
        aihn.registerDefaultInstance(aqom.class, aqomVar);
    }

    private aqom() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case 3:
                return new aqom();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqom.class);
            default:
                return null;
        }
    }
}
