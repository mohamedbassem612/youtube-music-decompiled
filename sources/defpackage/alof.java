package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alof extends aihn implements aiis {
    public static final alof a;
    public int b;
    public alop c;
    public ajwo d;
    private albe f;
    private byte g = 2;
    public aigj e = aigj.d;

    static {
        alof alofVar = new alof();
        a = alofVar;
        aihn.registerDefaultInstance(alof.class, alofVar);
    }

    private alof() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0005ည\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alof();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alof.class);
            default:
                return null;
        }
    }
}
