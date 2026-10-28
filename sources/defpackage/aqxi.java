package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxi extends aihn implements aiis {
    public static final aqxi a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private byte h = 2;

    static {
        aqxi aqxiVar = new aqxi();
        a = aqxiVar;
        aihn.registerDefaultInstance(aqxi.class, aqxiVar);
    }

    private aqxi() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\bᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqxi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxi.class);
            default:
                return null;
        }
    }
}
