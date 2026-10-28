package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asrl extends aihn implements aiis {
    public static final asrl a;
    public int b;
    public asnx d;
    public asmv e;
    public asop f;
    private byte g = 2;
    public String c = "";

    static {
        asrl asrlVar = new asrl();
        a = asrlVar;
        aihn.registerDefaultInstance(asrl.class, asrlVar);
    }

    private asrl() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asrl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asrl.class);
            default:
                return null;
        }
    }
}
