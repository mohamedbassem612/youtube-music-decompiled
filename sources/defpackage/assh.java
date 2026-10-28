package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class assh extends aihn implements aiis {
    public static final assh a;
    public int b;
    public Object d;
    public aijp e;
    public int c = 0;
    private byte f = 2;

    static {
        assh asshVar = new assh();
        a = asshVar;
        aihn.registerDefaultInstance(assh.class, asshVar);
    }

    private assh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဉ\u0000\u0002<\u0000\u0003м\u0000\u0004м\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000", new Object[]{"d", "c", "b", "e", assg.class, assf.class, assa.class, asrz.class, assd.class, asse.class, assb.class});
            case 3:
                return new assh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assh.class);
            default:
                return null;
        }
    }
}
