package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apaq extends aihn implements aiis {
    public static final apaq a;
    private int b;
    private apaj c;
    private apji d;
    private aivc e;
    private apji f;
    private byte g = 2;

    static {
        apaq apaqVar = new apaq();
        a = apaqVar;
        aihn.registerDefaultInstance(apaq.class, apaqVar);
    }

    private apaq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apaq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apaq.class);
            default:
                return null;
        }
    }
}
