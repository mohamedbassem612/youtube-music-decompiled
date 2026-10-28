package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alyi extends aihi implements aihj {
    public static final alyi a;
    public int b;
    public Object d;
    public Object f;
    public alop g;
    public int h;
    public boolean i;
    private albe k;
    public int c = 0;
    public int e = 0;
    private byte l = 2;

    static {
        alyi alyiVar = new alyi();
        a = alyiVar;
        aihn.registerDefaultInstance(alyi.class, alyiVar);
    }

    private alyi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0002\u0001\u0001̉\t\u0000\u0000\u0005\u0001ᐉ\u0000\u0002м\u0000\u0003м\u0001\u0004;\u0000\u0005;\u0001\u0007᠌\u0001\tм\u0001\nဇ\u0002̉ᐉ\u0004", new Object[]{"d", "c", "f", "e", "b", "g", alvt.class, amae.class, "h", aqcj.n, alqc.class, "i", "k"});
            case 3:
                return new alyi();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyi.class);
            default:
                return null;
        }
    }
}
