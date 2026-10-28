package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhn extends aihn implements aiis {
    public static final aqhn a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public aigj e = aigj.d;

    static {
        aqhn aqhnVar = new aqhn();
        a = aqhnVar;
        aihn.registerDefaultInstance(aqhn.class, aqhnVar);
    }

    private aqhn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u0002ည\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", akel.class});
            case 3:
                return new aqhn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhn.class);
            default:
                return null;
        }
    }
}
