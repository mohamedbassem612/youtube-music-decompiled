package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alwu extends aihn implements aiis {
    public static final alwu a;
    public int b;
    public alop c;
    public ajwo d;
    public akll e;
    private albe f;
    private byte g = 2;

    static {
        alwu alwuVar = new alwu();
        a = alwuVar;
        aihn.registerDefaultInstance(alwu.class, alwuVar);
    }

    private alwu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alwu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwu.class);
            default:
                return null;
        }
    }
}
