package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alna extends aihn implements aiis {
    public static final alna a;
    public int b;
    public alay c;
    public ajwo d;
    public ajng e;
    public int f;
    public boolean g;
    public boolean h;
    private alay i;
    private ajwo j;
    private ajwo k;
    private byte l = 2;

    static {
        alna alnaVar = new alna();
        a = alnaVar;
        aihn.registerDefaultInstance(alna.class, alnaVar);
    }

    private alna() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\u0011\t\u0000\u0000\u0006\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\b\b᠌\t\nᐉ\u0005\rဇ\r\u000fဇ\u000f\u0011ᐉ\u0006", new Object[]{"b", "c", "i", "j", "e", "f", ajpr.t, "d", "g", "h", "k"});
            case 3:
                return new alna();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alna.class);
            default:
                return null;
        }
    }
}
