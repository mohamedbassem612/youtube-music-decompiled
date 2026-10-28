package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class allp extends aihn implements aiis {
    public static final allp a;
    public aofv b;
    public boolean c;
    public boolean d;
    public float e;
    private int f;
    private byte g = 2;

    static {
        allp allpVar = new allp();
        a = allpVar;
        aihn.registerDefaultInstance(allp.class, allpVar);
    }

    private allp() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0007ခ\u0006", new Object[]{"f", "b", "c", "d", "e"});
            case 3:
                return new allp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allp.class);
            default:
                return null;
        }
    }
}
