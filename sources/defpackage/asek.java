package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asek extends aihn implements aiis {
    public static final asek a;
    public int b;
    public asei d;
    public asej e;
    private byte f = 2;
    public String c = "";

    static {
        asek asekVar = new asek();
        a = asekVar;
        aihn.registerDefaultInstance(asek.class, asekVar);
    }

    private asek() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asek();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asek.class);
            default:
                return null;
        }
    }
}
