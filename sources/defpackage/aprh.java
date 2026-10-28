package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aprh extends aihn implements aiis {
    public static final aprh a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private byte f = 2;

    static {
        aprh aprhVar = new aprh();
        a = aprhVar;
        aihn.registerDefaultInstance(aprh.class, aprhVar);
    }

    private aprh() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ᐉ\u0002\u0004ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aprh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprh.class);
            default:
                return null;
        }
    }
}
