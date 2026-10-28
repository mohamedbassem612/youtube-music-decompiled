package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anta extends aihn implements aiis {
    public static final anta a;
    public int b;
    public boolean c;
    public boolean d;
    public almd e;
    private byte f = 2;

    static {
        anta antaVar = new anta();
        a = antaVar;
        aihn.registerDefaultInstance(anta.class, antaVar);
    }

    private anta() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anta();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anta.class);
            default:
                return null;
        }
    }
}
