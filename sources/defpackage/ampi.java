package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampi extends aihn implements aiis {
    public static final ampi a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ampi ampiVar = new ampi();
        a = ampiVar;
        aihn.registerDefaultInstance(ampi.class, ampiVar);
    }

    private ampi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueb11ἑ\uf492䤳\u0002\u0000\u0000\u0002\ueb11ἑм\u0000\uf492䤳м\u0000", new Object[]{"c", "b", ajnf.class, akrn.class});
            case 3:
                return new ampi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampi.class);
            default:
                return null;
        }
    }
}
