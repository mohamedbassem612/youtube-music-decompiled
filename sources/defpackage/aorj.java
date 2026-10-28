package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aorj extends aihn implements aiis {
    public static final aorj a;
    private int b;
    private aork c;
    private byte d = 2;

    static {
        aorj aorjVar = new aorj();
        a = aorjVar;
        aihn.registerDefaultInstance(aorj.class, aorjVar);
    }

    private aorj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf0ac뇙\uf0ac뇙\u0001\u0000\u0000\u0001\uf0ac뇙ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aorj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aorj.class);
            default:
                return null;
        }
    }
}
