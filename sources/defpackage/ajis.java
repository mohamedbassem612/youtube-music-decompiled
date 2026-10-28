package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajis extends aihi implements aihj {
    public static final ajis a;
    private int e;
    private alay f;
    private apji g;
    private byte h = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        ajis ajisVar = new ajis();
        a = ajisVar;
        aihn.registerDefaultInstance(ajis.class, ajisVar);
    }

    private ajis() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0003\u0005\u0001Л\u0002ᐉ\u0001\u0004Л\u0006Л\rᐉ\b", new Object[]{"e", "b", ajir.class, "f", "c", ajir.class, "d", ajir.class, "g"});
            case 3:
                return new ajis();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajis.class);
            default:
                return null;
        }
    }
}
