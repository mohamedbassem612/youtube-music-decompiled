package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqsm extends aihn implements aiis {
    public static final aqsm a;
    public int b;
    public aqsl c;
    private byte d = 2;

    static {
        aqsm aqsmVar = new aqsm();
        a = aqsmVar;
        aihn.registerDefaultInstance(aqsm.class, aqsmVar);
    }

    private aqsm() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf27a䀍\uf27a䀍\u0001\u0000\u0000\u0001\uf27a䀍ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqsm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsm.class);
            default:
                return null;
        }
    }
}
