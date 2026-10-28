package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwt extends aihn implements aiis {
    public static final aqwt a;
    private int b;
    private aquc c;
    private byte d = 2;

    static {
        aqwt aqwtVar = new aqwt();
        a = aqwtVar;
        aihn.registerDefaultInstance(aqwt.class, aqwtVar);
    }

    private aqwt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf34b䃺\uf34b䃺\u0001\u0000\u0000\u0001\uf34b䃺ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqwt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwt.class);
            default:
                return null;
        }
    }
}
