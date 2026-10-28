package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoqa extends aihn implements aiis {
    public static final aoqa a;
    public int b;
    public alay d;
    private byte g = 2;
    public String c = "";
    public aihv e = emptyIntList();
    public aihv f = emptyIntList();

    static {
        aoqa aoqaVar = new aoqa();
        a = aoqaVar;
        aihn.registerDefaultInstance(aoqa.class, aoqaVar);
    }

    private aoqa() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u0016\u0004\u0016", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aoqa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoqa.class);
            default:
                return null;
        }
    }
}
