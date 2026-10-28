package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrq extends aihn implements aiis {
    public static final asrq a;
    public int b;
    public asrk d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        asrq asrqVar = new asrq();
        a = asrqVar;
        aihn.registerDefaultInstance(asrq.class, asrqVar);
    }

    private asrq() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "c", asrp.class, "d"});
            case 3:
                return new asrq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asrq.class);
            default:
                return null;
        }
    }
}
