package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvq extends aihn implements aiis {
    public static final alvq a;
    public int b;
    public amzh c;
    public arnk d;
    public aqof e;
    private ajws f;
    private byte g = 2;

    static {
        alvq alvqVar = new alvq();
        a = alvqVar;
        aihn.registerDefaultInstance(alvq.class, alvqVar);
    }

    private alvq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uefcf⸵\ue60b囤\u0004\u0000\u0000\u0004\uefcf⸵ᐉ\u0000\uf23f㤑ᐉ\u0001\ueb41䣥ᐉ\u0002\ue60b囤ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alvq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvq.class);
            default:
                return null;
        }
    }
}
