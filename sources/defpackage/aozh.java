package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozh extends aihn implements aiis {
    public static final aozh a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private byte h = 2;

    static {
        aozh aozhVar = new aozh();
        a = aozhVar;
        aihn.registerDefaultInstance(aozh.class, aozhVar);
    }

    private aozh() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\bᐉ\u0004\tᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aozh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozh.class);
            default:
                return null;
        }
    }
}
