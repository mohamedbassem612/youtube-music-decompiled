package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antf extends aihn implements aiis {
    public static final antf a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private byte f = 2;

    static {
        antf antfVar = new antf();
        a = antfVar;
        aihn.registerDefaultInstance(antf.class, antfVar);
    }

    private antf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0003\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0002", new Object[]{"b", "d", "e", "c"});
            case 3:
                return new antf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(antf.class);
            default:
                return null;
        }
    }
}
