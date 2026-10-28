package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajka extends aihn implements aiis {
    public static final ajka a;
    public boolean b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private apji h;
    private byte i = 2;

    static {
        ajka ajkaVar = new ajka();
        a = ajkaVar;
        aihn.registerDefaultInstance(ajka.class, ajkaVar);
    }

    private ajka() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\tဇ\b", new Object[]{"c", "d", "e", "f", "g", "h", "b"});
            case 3:
                return new ajka();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajka.class);
            default:
                return null;
        }
    }
}
