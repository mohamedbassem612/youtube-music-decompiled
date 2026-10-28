package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aktq extends aihn implements aiis {
    public static final aktq a;
    public int b;
    public int c;
    public int d;
    public aktj e;
    private byte f = 2;

    static {
        aktq aktqVar = new aktq();
        a = aktqVar;
        aihn.registerDefaultInstance(aktq.class, aktqVar);
    }

    private aktq() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဋ\u0000\u0002ဋ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aktq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktq.class);
            default:
                return null;
        }
    }
}
