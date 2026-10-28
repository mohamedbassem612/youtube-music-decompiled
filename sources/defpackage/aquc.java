package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aquc extends aihn implements aiis {
    public static final aquc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        aquc aqucVar = new aquc();
        a = aqucVar;
        aihn.registerDefaultInstance(aquc.class, aqucVar);
    }

    private aquc() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0003ᐉ\u0007\u0004ᐉ\b\u0005ᐉ\u0002\u0006ᐉ\u0003\tᐉ\u0004", new Object[]{"b", "c", "g", "h", "d", "e", "f"});
            case 3:
                return new aquc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aquc.class);
            default:
                return null;
        }
    }
}
