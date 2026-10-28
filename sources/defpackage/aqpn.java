package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqpn extends aihn implements aiis {
    public static final aqpn a;
    public boolean b;
    public boolean c;
    private int d;
    private apji e;
    private ajwo f;
    private byte g = 2;

    static {
        aqpn aqpnVar = new aqpn();
        a = aqpnVar;
        aihn.registerDefaultInstance(aqpn.class, aqpnVar);
    }

    private aqpn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"d", "b", "e", "f", "c"});
            case 3:
                return new aqpn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqpn.class);
            default:
                return null;
        }
    }
}
