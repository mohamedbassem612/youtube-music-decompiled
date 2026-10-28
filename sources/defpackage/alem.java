package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alem extends aihn implements aiis {
    public static final alem a;
    public static final aihl b;
    public int c;
    public alen d;
    public ajwo e;
    public ajwo f;
    public ajwo g;
    public ajwo h;
    public aroq j;
    private akal l;
    private byte m = 2;
    public String i = "";
    public aigj k = aigj.d;

    static {
        alem alemVar = new alem();
        a = alemVar;
        aihn.registerDefaultInstance(alem.class, alemVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, alemVar, alemVar, null, 450073971, aika.MESSAGE, alem.class);
    }

    private alem() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\b\u0007ဈ\u0005\nဉ\u0006\u000bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "k", "i", "j", "l"});
            case 3:
                return new alem();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alem.class);
            default:
                return null;
        }
    }
}
