package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aits extends aihn implements aiis {
    public static final aits a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private alay g;
    private alay h;
    private ajwo i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        aits aitsVar = new aits();
        a = aitsVar;
        aihn.registerDefaultInstance(aits.class, aitsVar);
    }

    private aits() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\r\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0007ᐉ\u0003\bᐉ\u0006\nᐉ\b\fᐉ\u0007\rᐉ\u0004", new Object[]{"b", "c", "d", "e", "h", "f", "i", "k", "j", "g"});
            case 3:
                return new aits();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aits.class);
            default:
                return null;
        }
    }
}
