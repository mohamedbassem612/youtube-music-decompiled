package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amah extends aihn implements aiis {
    public static final amah a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amah amahVar = new amah();
        a = amahVar;
        aihn.registerDefaultInstance(amah.class, amahVar);
    }

    private amah() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uea3aᮽ\ufbc8歬\u0003\u0000\u0000\u0003\uea3aᮽм\u0000\ue2ad单м\u0000\ufbc8歬м\u0000", new Object[]{"c", "b", aqjj.class, aqwf.class, aqyn.class});
            case 3:
                return new amah();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amah.class);
            default:
                return null;
        }
    }
}
