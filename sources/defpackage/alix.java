package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alix extends aihn implements aiis {
    public static final alix a;
    public int b;
    public alay c;
    public alja d;
    public ajwo e;
    private alay g;
    private byte h = 2;
    public aigj f = aigj.d;

    static {
        alix alixVar = new alix();
        a = alixVar;
        aihn.registerDefaultInstance(alix.class, alixVar);
    }

    private alix() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0005", new Object[]{"b", "c", "d", "g", "e", "f"});
            case 3:
                return new alix();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alix.class);
            default:
                return null;
        }
    }
}
