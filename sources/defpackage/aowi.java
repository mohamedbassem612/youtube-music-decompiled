package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aowi extends aihn implements aiis {
    public static final aowi a;
    public int b;
    public alay c;
    public boolean d;
    public double e;
    public alay f;
    public ajwo g;
    public ajwo h;
    private ajwo i;
    private ajwo j;
    private alay k;
    private alay l;
    private byte m = 2;

    static {
        aowi aowiVar = new aowi();
        a = aowiVar;
        aihn.registerDefaultInstance(aowi.class, aowiVar);
    }

    private aowi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\b\u0001ᐉ\u0000\u0003ဇ\u0003\u0004ᐉ\u0004\u0005က\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\u000b\u000eᐉ\r", new Object[]{"b", "c", "d", "i", "e", "f", "g", "h", "j", "k", "l"});
            case 3:
                return new aowi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowi.class);
            default:
                return null;
        }
    }
}
