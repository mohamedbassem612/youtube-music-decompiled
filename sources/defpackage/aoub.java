package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoub extends aihn implements aiis {
    public static final aoub a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        aoub aoubVar = new aoub();
        a = aoubVar;
        aihn.registerDefaultInstance(aoub.class, aoubVar);
    }

    private aoub() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aoub();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoub.class);
            default:
                return null;
        }
    }
}
