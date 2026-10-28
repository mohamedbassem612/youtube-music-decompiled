package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqjz extends aihn implements aiis {
    public static final aqjz a;
    public int b;
    public alay c;
    public aqkb d;
    public boolean e;
    private byte g = 2;
    public aigj f = aigj.d;

    static {
        aqjz aqjzVar = new aqjz();
        a = aqjzVar;
        aihn.registerDefaultInstance(aqjz.class, aqjzVar);
    }

    private aqjz() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0004\u0004ဉ\u0001\u0005ဇ\u0002", new Object[]{"b", "c", "f", "d", "e"});
            case 3:
                return new aqjz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjz.class);
            default:
                return null;
        }
    }
}
