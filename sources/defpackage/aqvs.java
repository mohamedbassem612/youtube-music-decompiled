package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvs extends aihn implements aiis {
    public static final aqvs a;
    private int b;
    private apji c;
    private alay d;
    private apji e;
    private alay f;
    private alay g;
    private ajwo h;
    private ajkc i;
    private ajwo j;
    private byte k = 2;

    static {
        aqvs aqvsVar = new aqvs();
        a = aqvsVar;
        aihn.registerDefaultInstance(aqvs.class, aqvsVar);
    }

    private aqvs() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\u0006\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aqvs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvs.class);
            default:
                return null;
        }
    }
}
