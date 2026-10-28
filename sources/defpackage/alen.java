package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alen extends aihn implements aiis {
    public static final alen a;
    public aigj b;
    public aigj c;
    private int d;
    private ajwo e;
    private apji f;
    private ajwo g;
    private apji h;
    private byte i = 2;

    static {
        alen alenVar = new alen();
        a = alenVar;
        aihn.registerDefaultInstance(alen.class, alenVar);
    }

    private alen() {
        aigj aigjVar = aigj.d;
        this.b = aigjVar;
        this.c = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0004\f\u0006\u0000\u0000\u0004\u0004ည\u0004\u0005ည\u0005\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\u0006", new Object[]{"d", "b", "c", "f", "g", "h", "e"});
            case 3:
                return new alen();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alen.class);
            default:
                return null;
        }
    }
}
