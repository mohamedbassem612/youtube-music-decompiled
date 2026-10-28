package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axgx extends aihi implements aihj {
    public static final axgx a;
    public int b;
    public long d;
    private byte f = 2;
    public String c = "";
    public String e = "";

    static {
        axgx axgxVar = new axgx();
        a = axgxVar;
        aihn.registerDefaultInstance(axgx.class, axgxVar);
    }

    private axgx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new axgx();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axgx.class);
            default:
                return null;
        }
    }
}
