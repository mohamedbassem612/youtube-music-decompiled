package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asee extends aihn implements aiis {
    public static final asee a;
    public int b;
    public aklk d;
    public asef e;
    private byte f = 2;
    public String c = "";

    static {
        asee aseeVar = new asee();
        a = aseeVar;
        aihn.registerDefaultInstance(asee.class, aseeVar);
    }

    private asee() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asee();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asee.class);
            default:
                return null;
        }
    }
}
