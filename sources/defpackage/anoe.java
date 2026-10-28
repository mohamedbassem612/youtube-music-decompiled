package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anoe extends aihn implements aiis {
    public static final anoe a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anoe anoeVar = new anoe();
        a = anoeVar;
        aihn.registerDefaultInstance(anoe.class, anoeVar);
    }

    private anoe() {
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
                return newMessageInfo(a, "\u0004\u0010\u0001\u0000\u0001\u0012\u0010\u0000\u0000\u0004\u0001м\u0000\u0002м\u0000\u0003<\u0000\u0005м\u0000\u0007м\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"c", "b", ankd.class, ankw.class, anmc.class, anuu.class, anzd.class, ankc.class, anut.class, anux.class, anuw.class, anzc.class, anze.class, anke.class, ankv.class, ankx.class, anwh.class, anqh.class});
            case 3:
                return new anoe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anoe.class);
            default:
                return null;
        }
    }
}
