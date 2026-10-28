package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkp extends aihn implements aiis {
    public static final alkp a;
    private int b;
    private apbj c;
    private byte d = 2;

    static {
        alkp alkpVar = new alkp();
        a = alkpVar;
        aihn.registerDefaultInstance(alkp.class, alkpVar);
    }

    private alkp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001ｃ᷽ｃ᷽\u0001\u0000\u0000\u0001ｃ᷽ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alkp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkp.class);
            default:
                return null;
        }
    }
}
