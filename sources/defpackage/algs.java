package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algs extends aihn implements aiis {
    public static final algs a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;

    static {
        algs algsVar = new algs();
        a = algsVar;
        aihn.registerDefaultInstance(algs.class, algsVar);
    }

    private algs() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0004\u0002ᐉ\u0000\u0006ᐉ\u0002\bᐉ\u0003\tᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new algs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algs.class);
            default:
                return null;
        }
    }
}
