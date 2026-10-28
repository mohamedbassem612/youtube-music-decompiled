package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apuy extends aihn implements aiis {
    public static final apuy a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        apuy apuyVar = new apuy();
        a = apuyVar;
        aihn.registerDefaultInstance(apuy.class, apuyVar);
    }

    private apuy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new apuy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apuy.class);
            default:
                return null;
        }
    }
}
