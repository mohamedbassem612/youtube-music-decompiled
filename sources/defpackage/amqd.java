package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqd extends aihn implements aiis {
    public static final amqd a;
    private int d;
    private apji e;
    private alay f;
    private byte g = 2;
    public String b = "";
    public aiie c = emptyProtobufList();

    static {
        amqd amqdVar = new amqd();
        a = amqdVar;
        aihn.registerDefaultInstance(amqd.class, amqdVar);
    }

    private amqd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0006ᐉ\u0004", new Object[]{"d", "b", "c", apji.class, "e", "f"});
            case 3:
                return new amqd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqd.class);
            default:
                return null;
        }
    }
}
