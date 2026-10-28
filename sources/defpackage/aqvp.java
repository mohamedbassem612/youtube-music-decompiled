package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvp extends aihn implements aiis {
    public static final aqvp a;
    private int b;
    private alau c;
    private byte d = 2;

    static {
        aqvp aqvpVar = new aqvp();
        a = aqvpVar;
        aihn.registerDefaultInstance(aqvp.class, aqvpVar);
    }

    private aqvp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf52d⮾\uf52d⮾\u0001\u0000\u0000\u0001\uf52d⮾ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqvp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvp.class);
            default:
                return null;
        }
    }
}
