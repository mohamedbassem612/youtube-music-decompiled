package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxt extends aihi implements aihj {
    public static final fxt a;
    private int b;
    private aios c;
    private byte d = 2;

    static {
        fxt fxtVar = new fxt();
        a = fxtVar;
        aihn.registerDefaultInstance(fxt.class, fxtVar);
    }

    private fxt() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0001\u0014ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new fxt();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(fxt.class);
            default:
                return null;
        }
    }
}
