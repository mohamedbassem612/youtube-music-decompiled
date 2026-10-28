package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfi extends aihn implements aiis {
    public static final akfi a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        akfi akfiVar = new akfi();
        a = akfiVar;
        aihn.registerDefaultInstance(akfi.class, akfiVar);
    }

    private akfi() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new akfi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfi.class);
            default:
                return null;
        }
    }
}
