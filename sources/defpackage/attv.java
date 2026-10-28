package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class attv extends aihn implements aiis {
    public static final attv a;
    public int b;
    private byte e = 2;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        attv attvVar = new attv();
        a = attvVar;
        aihn.registerDefaultInstance(attv.class, attvVar);
    }

    private attv() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"b", "c", "d", attu.class});
            case 3:
                return new attv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(attv.class);
            default:
                return null;
        }
    }
}
