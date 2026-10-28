package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqbp extends aihn implements aiis {
    public static final aqbp a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private byte g = 2;

    static {
        aqbp aqbpVar = new aqbp();
        a = aqbpVar;
        aihn.registerDefaultInstance(aqbp.class, aqbpVar);
    }

    private aqbp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\t\u0004\u0000\u0000\u0004\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqbp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbp.class);
            default:
                return null;
        }
    }
}
