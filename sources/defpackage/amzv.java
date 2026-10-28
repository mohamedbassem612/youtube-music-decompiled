package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amzv extends aihn implements aiis {
    public static final amzv a;
    public int b;
    public alop c;
    public amzl e;
    public amzl h;
    public amzu i;
    private byte k = 2;
    public aiie d = emptyProtobufList();
    public aigj f = aigj.d;
    public aiie g = emptyProtobufList();
    public aiie j = emptyProtobufList();

    static {
        amzv amzvVar = new amzv();
        a = amzvVar;
        aihn.registerDefaultInstance(amzv.class, amzvVar);
    }

    private amzv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0003\u0004\u0001ᐉ\u0000\u0002Л\u0004ည\u0003\u0005\u001b\u0006ဉ\u0004\u0007ᐉ\u0005\bЛ\tဉ\u0001", new Object[]{"b", "c", "d", amzx.class, "f", "g", amzq.class, "h", "i", "j", amzz.class, "e"});
            case 3:
                return new amzv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amzv.class);
            default:
                return null;
        }
    }
}
