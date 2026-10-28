package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amqt extends aihn implements aiis {
    public static final amqt a;
    public int b;
    public alja c;
    public alay d;
    public apji e;
    public ajwo f;
    public amqs i;
    public amqs j;
    public amqs k;
    private byte l = 2;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();

    static {
        amqt amqtVar = new amqt();
        a = amqtVar;
        aihn.registerDefaultInstance(amqt.class, amqtVar);
    }

    private amqt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\t\u0001ᐉ\u0001\u0002Л\u0003Л\u0004ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006", new Object[]{"b", "d", "g", amqs.class, "h", amqu.class, "c", "e", "f", "i", "j", "k"});
            case 3:
                return new amqt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqt.class);
            default:
                return null;
        }
    }
}
