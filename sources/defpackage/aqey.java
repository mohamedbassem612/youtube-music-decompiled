package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqey extends aihn implements aiis {
    public static final aqey a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        aqey aqeyVar = new aqey();
        a = aqeyVar;
        aihn.registerDefaultInstance(aqey.class, aqeyVar);
    }

    private aqey() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new aqey();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqey.class);
            default:
                return null;
        }
    }
}
