package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvh extends aihn implements aiis {
    public static final akvh a;
    public int b;
    public int d;
    public akvd e;
    public akvi f;
    public akvg g;
    private byte h = 2;
    public String c = "";

    static {
        akvh akvhVar = new akvh();
        a = akvhVar;
        aihn.registerDefaultInstance(akvh.class, akvhVar);
    }

    private akvh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002᠌\u0001\u0003ᐉ\u0003\u0004ဉ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", akvb.d, "f", "e", "g"});
            case 3:
                return new akvh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akvh.class);
            default:
                return null;
        }
    }
}
