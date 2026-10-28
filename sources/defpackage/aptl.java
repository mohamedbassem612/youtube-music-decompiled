package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aptl extends aihn implements aiis {
    public static final aptl a;
    private int b;
    private alay c;
    private ajwo d;
    private alay e;
    private alay f;
    private alay g;
    private apji h;
    private apji i;
    private apji j;
    private ajwo k;
    private byte l = 2;

    static {
        aptl aptlVar = new aptl();
        a = aptlVar;
        aihn.registerDefaultInstance(aptl.class, aptlVar);
    }

    private aptl() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\u0005\bᐉ\t\rᐉ\f\u0010ᐉ\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i", "k", "j"});
            case 3:
                return new aptl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptl.class);
            default:
                return null;
        }
    }
}
