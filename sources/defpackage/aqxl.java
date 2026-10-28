package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxl extends aihn implements aiis {
    public static final aqxl a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private angb h;
    private ajwo i;
    private ajkc j;
    private ajkc k;
    private ajwo l;
    private ajkc m;
    private aqyc n;
    private ajkc o;
    private byte p = 2;

    static {
        aqxl aqxlVar = new aqxl();
        a = aqxlVar;
        aihn.registerDefaultInstance(aqxl.class, aqxlVar);
    }

    private aqxl() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u0017\r\u0000\u0000\r\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\n\fᐉ\f\rᐉ\u000e\u000eᐉ\r\u000fᐉ\u0007\u0010ᐉ\b\u0011ᐉ\t\u0014ᐉ\u0012\u0015ᐉ\u0010\u0017ᐉ\u000f", new Object[]{"b", "c", "d", "e", "i", "j", "l", "k", "f", "g", "h", "o", "n", "m"});
            case 3:
                return new aqxl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxl.class);
            default:
                return null;
        }
    }
}
