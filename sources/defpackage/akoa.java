package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class akoa extends aihn implements aiis {
    public static final akoa a;
    public int b;
    public Object d;
    public alay e;
    public alay f;
    public boolean g;
    public aiqd h;
    public boolean i;
    public alja j;
    private alay k;
    private apji l;
    private ajwo m;
    private alay n;
    public int c = 0;
    private byte o = 2;

    static {
        akoa akoaVar = new akoa();
        a = akoaVar;
        aihn.registerDefaultInstance(akoa.class, akoaVar);
    }

    private akoa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0001\u0001\u0001\u000f\f\u0000\u0000\u0007\u0001ᐉ\u0000\u0003ဇ\u0005\u0004ဉ\u0007\u00067\u0000\u0007;\u0000\bᐉ\u0001\nᐉ\t\u000bဇ\n\fᐉ\u000b\rᐉ\f\u000eᐉ\u0002\u000fᐉ\r", new Object[]{"d", "c", "b", "e", "g", "h", "k", "l", "i", "m", "j", "f", "n"});
            case 3:
                return new akoa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akoa.class);
            default:
                return null;
        }
    }
}
