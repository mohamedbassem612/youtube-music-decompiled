package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arpo extends aihn implements aiis {
    public static final arpo a;
    public int b;
    public arpn c;
    private byte d = 2;

    static {
        arpo arpoVar = new arpo();
        a = arpoVar;
        aihn.registerDefaultInstance(arpo.class, arpoVar);
    }

    private arpo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001綾㘥綾㘥\u0001\u0000\u0000\u0001綾㘥ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arpo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpo.class);
            default:
                return null;
        }
    }
}
