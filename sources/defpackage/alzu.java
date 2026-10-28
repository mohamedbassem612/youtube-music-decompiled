package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alzu extends aihn implements aiis {
    public static final alzu a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alzu alzuVar = new alzu();
        a = alzuVar;
        aihn.registerDefaultInstance(alzu.class, alzuVar);
    }

    private alzu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000бﵸ⮹\u0004\u0000\u0000\u0004бм\u0000\ue7f5ណм\u0000滋⅚м\u0000ﵸ⮹м\u0000", new Object[]{"c", "b", arhx.class, apoq.class, anif.class, amai.class});
            case 3:
                return new alzu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzu.class);
            default:
                return null;
        }
    }
}
