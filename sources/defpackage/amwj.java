package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amwj extends aihn implements aiis {
    public static final amwj a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        amwj amwjVar = new amwj();
        a = amwjVar;
        aihn.registerDefaultInstance(amwj.class, amwjVar);
    }

    private amwj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new amwj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amwj.class);
            default:
                return null;
        }
    }
}
