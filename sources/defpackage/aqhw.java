package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhw extends aihn implements aiis {
    public static final aqhw a;
    private int b;
    private aqhv c;
    private aqhv d;
    private aqhv e;
    private byte f = 2;

    static {
        aqhw aqhwVar = new aqhw();
        a = aqhwVar;
        aihn.registerDefaultInstance(aqhw.class, aqhwVar);
    }

    private aqhw() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqhw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhw.class);
            default:
                return null;
        }
    }
}
