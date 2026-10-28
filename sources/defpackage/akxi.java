package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akxi extends aihn implements aiis {
    public static final akxi a;
    private int b;
    private apji c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private alay j;
    private alay k;
    private alay l;
    private byte m = 2;

    static {
        akxi akxiVar = new akxi();
        a = akxiVar;
        aihn.registerDefaultInstance(akxi.class, akxiVar);
    }

    private akxi() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\n\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\n\fᐉ\u000b\u0012ᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new akxi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akxi.class);
            default:
                return null;
        }
    }
}
