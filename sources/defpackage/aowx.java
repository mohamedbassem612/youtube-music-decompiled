package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aowx extends aihn implements aiis {
    public static final aowx a;
    private int b;
    private aowz c;
    private aowy d;
    private byte e = 2;

    static {
        aowx aowxVar = new aowx();
        a = aowxVar;
        aihn.registerDefaultInstance(aowx.class, aowxVar);
    }

    private aowx() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0001\u0002ဉ\u0002\bᐉ\u0007", new Object[]{"b", "c", "d"});
            case 3:
                return new aowx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowx.class);
            default:
                return null;
        }
    }
}
