package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqex extends aihn implements aiis {
    public static final aqex a;
    private int b;
    private ajwo c;
    private ajwo d;
    private alhs e;
    private apji f;
    private alay g;
    private byte h = 2;

    static {
        aqex aqexVar = new aqex();
        a = aqexVar;
        aihn.registerDefaultInstance(aqex.class, aqexVar);
    }

    private aqex() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0004\u0012\u0005\u0000\u0000\u0005\u0004ᐉ\u0005\nᐉ\u0003\u000eᐉ\u000e\u000fᐉ\u0004\u0012ᐉ\r", new Object[]{"b", "e", "c", "g", "d", "f"});
            case 3:
                return new aqex();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqex.class);
            default:
                return null;
        }
    }
}
