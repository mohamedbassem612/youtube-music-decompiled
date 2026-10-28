package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class airw extends aihn implements aiis {
    public static final aihw a = new aiat(4);
    public static final airw b;
    public askp c;
    public airx d;
    public airu e;
    public boolean h;
    public algw i;
    private int j;
    private byte k = 2;
    public String f = "";
    public aihv g = emptyIntList();

    static {
        airw airwVar = new airw();
        b = airwVar;
        aihn.registerDefaultInstance(airw.class, airwVar);
    }

    private airw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0002\u0006ဈ\u0005\u0007ࠬ\bဇ\u0006\tဉ\u0007", new Object[]{"j", "c", "d", "e", "f", "g", aiod.n, "h", "i"});
            case 3:
                return new airw();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(airw.class);
            default:
                return null;
        }
    }
}
