package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aliu extends aihn implements aiis {
    public static final aliu a;
    public int b;
    public ajwo d;
    public alja e;
    public boolean g;
    public int h;
    public ajwo i;
    public aiqd j;
    private byte m = 2;
    public String c = "";
    public String f = "";
    public String k = "";
    public aigj l = aigj.d;

    static {
        aliu aliuVar = new aliu();
        a = aliuVar;
        aihn.registerDefaultInstance(aliu.class, aliuVar);
    }

    private aliu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0002\u0003᠌\u0005\u0004ᐉ\u0006\u0006ည\n\u0007ဈ\u0003\bဇ\u0004\tဈ\b\nဉ\u0007\u000bᐉ\u0001", new Object[]{"b", "c", "e", "h", alip.g, "i", "l", "f", "g", "k", "j", "d"});
            case 3:
                return new aliu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aliu.class);
            default:
                return null;
        }
    }
}
