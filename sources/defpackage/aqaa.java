package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqaa extends aihn implements aiis {
    public static final aqaa a;
    public int b;
    public aqpk d;
    private aivw e;
    private aivf f;
    private byte g = 2;
    public aigj c = aigj.d;

    static {
        aqaa aqaaVar = new aqaa();
        a = aqaaVar;
        aihn.registerDefaultInstance(aqaa.class, aqaaVar);
    }

    private aqaa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0002\u0002ᐉ\u0001\u0006ည\u0003\bဉ\u0004\tᐉ\u0005", new Object[]{"b", "e", "c", "d", "f"});
            case 3:
                return new aqaa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqaa.class);
            default:
                return null;
        }
    }
}
