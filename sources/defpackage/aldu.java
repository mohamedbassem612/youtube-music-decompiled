package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aldu extends aihn implements aiis {
    public static final aldu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int i;
    public alay j;
    public int k;
    public int l;
    public alay m;
    public int n;
    public alay o;
    private byte p = 2;
    public String g = "";

    static {
        aldu alduVar = new aldu();
        a = alduVar;
        aihn.registerDefaultInstance(aldu.class, alduVar);
    }

    private aldu() {
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0006\u0012\r\u0000\u0000\u0003\u0006င\u0000\u0007င\u0001\bင\u0002\tင\u0003\nင\b\u000bင\t\fင\u000b\rᐉ\u0007\u000eᐉ\n\u000fᐉ\f\u0010င\u0005\u0011င\u0006\u0012ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "k", "l", "n", "j", "m", "o", "h", "i", "g"});
            case 3:
                return new aldu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldu.class);
            default:
                return null;
        }
    }
}
