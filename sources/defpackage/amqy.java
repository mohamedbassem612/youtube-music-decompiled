package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqy extends aihn implements aiis {
    public static final amqy a;
    public alay b;
    public alay c;
    public int d;
    public int e;
    private int f;
    private byte g = 2;

    static {
        amqy amqyVar = new amqy();
        a = amqyVar;
        aihn.registerDefaultInstance(amqy.class, amqyVar);
    }

    private amqy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဋ\u0002\u0006ဋ\u0006\u0007ᐉ\u0001", new Object[]{"f", "b", "d", "e", "c"});
            case 3:
                return new amqy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqy.class);
            default:
                return null;
        }
    }
}
