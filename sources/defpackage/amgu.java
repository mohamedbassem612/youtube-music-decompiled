package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amgu extends aihn implements aiis {
    public static final amgu a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public String e = "";

    static {
        amgu amguVar = new amgu();
        a = amguVar;
        aihn.registerDefaultInstance(amgu.class, amguVar);
    }

    private amgu() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002;\u0000\u0003м\u0000\u00047\u0000\u0005:\u0000\u00063\u0000", new Object[]{"d", "c", "b", "e", alay.class});
            case 3:
                return new amgu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgu.class);
            default:
                return null;
        }
    }
}
