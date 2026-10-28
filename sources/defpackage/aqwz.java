package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwz extends aihn implements aiis {
    public static final aqwz a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private ajkc i;
    private ajwo j;
    private alay k;
    private byte l = 2;

    static {
        aqwz aqwzVar = new aqwz();
        a = aqwzVar;
        aihn.registerDefaultInstance(aqwz.class, aqwzVar);
    }

    private aqwz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\tᐉ\b\nᐉ\t\u000fᐉ\u0004\u0010ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
            case 3:
                return new aqwz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwz.class);
            default:
                return null;
        }
    }
}
