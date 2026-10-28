package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoqj extends aihn implements aiis {
    public static final aoqj a;
    private int b;
    private aoqi c;
    private byte d = 2;

    static {
        aoqj aoqjVar = new aoqj();
        a = aoqjVar;
        aihn.registerDefaultInstance(aoqj.class, aoqjVar);
    }

    private aoqj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uecfd㺔\uecfd㺔\u0001\u0000\u0000\u0001\uecfd㺔ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoqj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqj.class);
            default:
                return null;
        }
    }
}
