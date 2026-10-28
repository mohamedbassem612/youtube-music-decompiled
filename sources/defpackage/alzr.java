package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alzr extends aihn implements aiis {
    public static final alzr a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alzr alzrVar = new alzr();
        a = alzrVar;
        aihn.registerDefaultInstance(alzr.class, alzrVar);
    }

    private alzr() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uf61aᘿ\uf61aᘿ\u0001\u0000\u0000\u0001\uf61aᘿм\u0000", new Object[]{"c", "b", ajis.class});
            case 3:
                return new alzr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzr.class);
            default:
                return null;
        }
    }
}
