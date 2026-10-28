package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apqr extends aihn implements aiis {
    public static final apqr a;
    public int b;
    public alay c;
    public alay d;
    public ajwo e;
    public apqx f;
    private alay g;
    private alay h;
    private alay i;
    private apji j;
    private alay k;
    private byte l = 2;

    static {
        apqr apqrVar = new apqr();
        a = apqrVar;
        aihn.registerDefaultInstance(apqr.class, apqrVar);
    }

    private apqr() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0013\t\u0000\u0000\t\u0002ᐉ\u0001\u0003ᐉ\t\u0004ᐉ\u0002\u0005ᐉ\n\nᐉ\u0005\u000fᐉ\u0007\u0010ᐉ\u0004\u0012ᐉ\b\u0013ᐉ\u0003", new Object[]{"b", "c", "e", "d", "f", "i", "j", "h", "k", "g"});
            case 3:
                return new apqr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqr.class);
            default:
                return null;
        }
    }
}
