package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqxa extends aihn implements aiis {
    public static final aqxa a;
    public alay b;
    public alay c;
    public aiqd d;
    public long e;
    private int f;
    private byte g = 2;

    static {
        aqxa aqxaVar = new aqxa();
        a = aqxaVar;
        aihn.registerDefaultInstance(aqxa.class, aqxaVar);
    }

    private aqxa() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ဂ\u0003\u0004ᐉ\u0001\u0006ဉ\u0002", new Object[]{"f", "b", "e", "c", "d"});
            case 3:
                return new aqxa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxa.class);
            default:
                return null;
        }
    }
}
