package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apkc extends aihn implements aiis {
    public static final apkc a;
    public int b;
    public aokg c;
    public alay d;
    public alay e;
    public ajng f;
    public ajng g;
    public ajlx h;
    private alay j;
    private ajng k;
    private ajlx l;
    private byte m = 2;
    public aigj i = aigj.d;

    static {
        apkc apkcVar = new apkc();
        a = apkcVar;
        aihn.registerDefaultInstance(apkc.class, apkcVar);
    }

    private apkc() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\t\u0001ᐉ\u0000\u0003ည\n\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0002\bᐉ\u0003\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "i", "d", "f", "k", "j", "e", "g", "h", "l"});
            case 3:
                return new apkc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apkc.class);
            default:
                return null;
        }
    }
}
