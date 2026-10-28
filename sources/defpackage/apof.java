package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apof extends aihn implements aiis {
    public static final apof a;
    public int b;
    public int d;
    public apho e;
    private byte f = 2;
    public String c = "";

    static {
        apof apofVar = new apof();
        a = apofVar;
        aihn.registerDefaultInstance(apof.class, apofVar);
    }

    private apof() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003င\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apof();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apof.class);
            default:
                return null;
        }
    }
}
