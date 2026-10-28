package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqh extends aihn implements aiis {
    public static final amqh a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        amqh amqhVar = new amqh();
        a = amqhVar;
        aihn.registerDefaultInstance(amqh.class, amqhVar);
    }

    private amqh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0003", new Object[]{"b", "c", "e", "f", "g", "d"});
            case 3:
                return new amqh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqh.class);
            default:
                return null;
        }
    }
}
