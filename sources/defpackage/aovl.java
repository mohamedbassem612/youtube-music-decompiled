package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aovl extends aihn implements aiis {
    public static final aovl a;
    public int b;
    public aovg c;
    private aovd d;
    private aovc e;
    private aovf f;
    private byte g = 2;

    static {
        aovl aovlVar = new aovl();
        a = aovlVar;
        aihn.registerDefaultInstance(aovl.class, aovlVar);
    }

    private aovl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb90▦\ue8d8⮯\u0004\u0000\u0000\u0004\ueb90▦ᐉ\u0000ﶯ✂ᐉ\u0001祉⮎ᐉ\u0003\ue8d8⮯ᐉ\u0002", new Object[]{"b", "d", "e", "f", "c"});
            case 3:
                return new aovl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aovl.class);
            default:
                return null;
        }
    }
}
