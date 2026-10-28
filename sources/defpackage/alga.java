package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alga extends aihn implements aiis {
    public static final alga a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private byte f = 2;

    static {
        alga algaVar = new alga();
        a = algaVar;
        aihn.registerDefaultInstance(alga.class, algaVar);
    }

    private alga() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0003\u0002ᐉ\u0002\bᐉ\u0001\tᐉ\u0003", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new alga();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alga.class);
            default:
                return null;
        }
    }
}
