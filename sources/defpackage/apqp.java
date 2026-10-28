package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apqp extends aihn implements aiis {
    public static final apqp a;
    public int b;
    public aigj c;
    private alay d;
    private byte e = 2;

    static {
        apqp apqpVar = new apqp();
        a = apqpVar;
        aihn.registerDefaultInstance(apqp.class, apqpVar);
    }

    private apqp() {
        emptyProtobufList();
        this.c = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0006ည\u0004", new Object[]{"b", "d", "c"});
            case 3:
                return new apqp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqp.class);
            default:
                return null;
        }
    }
}
