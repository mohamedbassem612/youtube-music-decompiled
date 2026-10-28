package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwk extends aihn implements aiis {
    public static final aqwk a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private aqvp g;
    private ajng h;
    private ajng i;
    private alay j;
    private ajng k;
    private ajng l;
    private ajng m;
    private byte n = 2;

    static {
        aqwk aqwkVar = new aqwk();
        a = aqwkVar;
        aihn.registerDefaultInstance(aqwk.class, aqwkVar);
    }

    private aqwk() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0000\u000b\u0002ᐉ\u0002\u0003ᐉ\u0005\u0004ᐉ\u0007\u0007ᐉ\b\bᐉ\u0004\tᐉ\t\fᐉ\n\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0011ᐉ\u0003", new Object[]{"b", "c", "f", "g", "h", "e", "i", "j", "k", "l", "m", "d"});
            case 3:
                return new aqwk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwk.class);
            default:
                return null;
        }
    }
}
