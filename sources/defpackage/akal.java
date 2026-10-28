package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akal extends aihn implements aiis {
    public static final akal a;
    public ajwn d;
    public boolean e;
    public akak f;
    private int g;
    private byte h = 2;
    public String b = "";
    public String c = "";

    static {
        akal akalVar = new akal();
        a = akalVar;
        aihn.registerDefaultInstance(akal.class, akalVar);
    }

    private akal() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0006ဉ\u0005", new Object[]{"g", "b", "c", "d", "e", "f"});
            case 3:
                return new akal();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akal.class);
            default:
                return null;
        }
    }
}
