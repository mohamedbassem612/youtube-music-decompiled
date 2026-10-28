package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atyf extends aihi implements aihj {
    public static final atyf a;
    private int b;
    private atye c;
    private byte d = 2;

    static {
        atyf atyfVar = new atyf();
        a = atyfVar;
        aihn.registerDefaultInstance(atyf.class, atyfVar);
    }

    private atyf() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new atyf();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atyf.class);
            default:
                return null;
        }
    }
}
