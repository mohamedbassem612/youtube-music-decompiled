package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqwj extends aihn implements aiis {
    public static final aqwj a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajng f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private ajng k;
    private ajng l;
    private ajng m;
    private alay n;
    private alay o;
    private ajng p;
    private byte q = 2;

    static {
        aqwj aqwjVar = new aqwj();
        a = aqwjVar;
        aihn.registerDefaultInstance(aqwj.class, aqwjVar);
    }

    private aqwj() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0012\u000e\u0000\u0000\u000e\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\tᐉ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000eᐉ\n\u000fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0012ᐉ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            case 3:
                return new aqwj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqwj.class);
            default:
                return null;
        }
    }
}
