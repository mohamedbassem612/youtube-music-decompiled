package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajwu extends aihn implements aiis {
    public static final ajwu a;
    public int b;
    public ajng c;
    private ajng d;
    private ajng e;
    private apji f;
    private apji g;
    private akib h;
    private ajng i;
    private ajng j;
    private ajng k;
    private ajng l;
    private ajww m;
    private apji n;
    private ajng o;
    private byte p = 2;

    static {
        ajwu ajwuVar = new ajwu();
        a = ajwuVar;
        aihn.registerDefaultInstance(ajwu.class, ajwuVar);
    }

    private ajwu() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\b\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\t\u0007ᐉ\u0001\u000eᐉ\n\u000fᐉ\u0005\u0011ᐉ\u0004\u0013ᐉ\u0003\u0014ᐉ\u000b\u0015ᐉ\r", new Object[]{"b", "d", "c", "k", "i", "j", "l", "e", "m", "h", "g", "f", "n", "o"});
            case 3:
                return new ajwu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwu.class);
            default:
                return null;
        }
    }
}
