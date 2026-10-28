package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqhi extends aihn implements aiis {
    public static final aqhi a;
    public int b;
    public String c;
    private int d;
    private alay e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aqhi aqhiVar = new aqhi();
        a = aqhiVar;
        aihn.registerDefaultInstance(aqhi.class, aqhiVar);
    }

    private aqhi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.c = "";
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0012\u0005\u0000\u0000\u0003\u0001ဋ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0002\tᐉ\u0005\u0012ဈ\u000e", new Object[]{"d", "b", "e", "f", "g", "c"});
            case 3:
                return new aqhi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhi.class);
            default:
                return null;
        }
    }
}
