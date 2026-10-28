package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqub extends aihn implements aiis {
    public static final aqub a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private ajwo j;
    private byte k = 2;

    static {
        aqub aqubVar = new aqub();
        a = aqubVar;
        aihn.registerDefaultInstance(aqub.class, aqubVar);
    }

    private aqub() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0006\u0007ᐉ\u0005\bᐉ\u0004\tᐉ\u0002\fᐉ\u0010\u000fᐉ\u0001", new Object[]{"b", "c", "f", "i", "h", "g", "e", "j", "d"});
            case 3:
                return new aqub();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqub.class);
            default:
                return null;
        }
    }
}
