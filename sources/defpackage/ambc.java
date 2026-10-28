package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ambc extends aihn implements aiis {
    public static final ambc a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ambc ambcVar = new ambc();
        a = ambcVar;
        aihn.registerDefaultInstance(ambc.class, ambcVar);
    }

    private ambc() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\uf321Ẑ黎䄊\u0004\u0000\u0000\u0004\uf321Ẑм\u0000\uf437Ἳм\u0000ﮜ\u2dd7м\u0000黎䄊м\u0000", new Object[]{"c", "b", akdd.class, arqe.class, aocd.class, amof.class});
            case 3:
                return new ambc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ambc.class);
            default:
                return null;
        }
    }
}
