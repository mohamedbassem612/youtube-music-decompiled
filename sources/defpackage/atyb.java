package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atyb extends aihn implements aiis {
    public static final atyb a;
    public int b;
    public afye c;
    public afyf d;
    private byte e = 2;

    static {
        atyb atybVar = new atyb();
        a = atybVar;
        aihn.registerDefaultInstance(atyb.class, atybVar);
    }

    private atyb() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new atyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atyb.class);
            default:
                return null;
        }
    }
}
