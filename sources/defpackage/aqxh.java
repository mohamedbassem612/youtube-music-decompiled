package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxh extends aihn implements aiis {
    public static final aqxh a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajng f;
    private ajng g;
    private ajng h;
    private ajng i;
    private ajwo j;
    private ajwo k;
    private byte l = 2;

    static {
        aqxh aqxhVar = new aqxh();
        a = aqxhVar;
        aihn.registerDefaultInstance(aqxh.class, aqxhVar);
    }

    private aqxh() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u000b\u000bᐉ\u0007\rᐉ\t\u000eᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", "j", "i"});
            case 3:
                return new aqxh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxh.class);
            default:
                return null;
        }
    }
}
