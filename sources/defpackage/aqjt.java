package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqjt extends aihn implements aiis {
    public static final aqjt a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aqjt aqjtVar = new aqjt();
        a = aqjtVar;
        aihn.registerDefaultInstance(aqjt.class, aqjtVar);
    }

    private aqjt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000暈㣧暈㣧\u0001\u0000\u0000\u0001暈㣧м\u0000", new Object[]{"c", "b", aqjv.class});
            case 3:
                return new aqjt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjt.class);
            default:
                return null;
        }
    }
}
