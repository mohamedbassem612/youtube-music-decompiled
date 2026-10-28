package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amql extends aihn implements aiis {
    public static final amql a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amql amqlVar = new amql();
        a = amqlVar;
        aihn.registerDefaultInstance(amql.class, amqlVar);
    }

    private amql() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf788㸁\uf788㸁\u0001\u0000\u0000\u0001\uf788㸁м\u0000", new Object[]{"c", "b", amot.class});
            case 3:
                return new amql();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amql.class);
            default:
                return null;
        }
    }
}
