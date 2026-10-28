package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqo extends aihn implements aiis {
    public static final amqo a;
    public int b;
    public apho c;
    public aqmx d;
    public amfj e;
    public amqr f;
    public aosj g;
    private byte h = 2;

    static {
        amqo amqoVar = new amqo();
        a = amqoVar;
        aihn.registerDefaultInstance(amqo.class, amqoVar);
    }

    private amqo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\uf697᳗\uf07f䚮\u0005\u0000\u0000\u0002\uf697᳗ᐉ\u0000\uec98↊ᐉ\u0001\uf488┤ဉ\u0002\ue75e䔴ဉ\u0003\uf07f䚮ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new amqo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqo.class);
            default:
                return null;
        }
    }
}
